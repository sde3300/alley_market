<template>
    <div class="container">
        <div class="jumbotron text-center">
            <h1>장바구니 목록</h1>
        </div>
        <hr>
        <!-- 주문내역 표로 보여줌 -->
        <table class="table">
            <thead>
                <tr>
                    <th class="column-1"></th>
                    <th class="column-2">상품명</th>
                    <th class="column-6">가게이름</th>
                    <th class="column-3">가격</th>
                    <th class="column-4">수량</th>
                    <th class="column-5">총합계</th>
                    <th class="column-6"></th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="item in cartLists" v-bind:key="item.customerPk">
                    <td class="column-1">
                        <img
                            id="myimg"
                            alt="localhost9000으로확인"
                            style=""
                            v-bind:src="item.storedFilePath"
                            data-holder-rendered="true"
                        />
                        <!-- <div class="cart-img-product" @click="delItem(item.id)">
                            <img :src="item.image" alt="IMG-PRODUCT">
                            데이터 연결 후, 클릭하면 장바구니에서 아이템이 삭제되도록
                        </div> -->
                    </td>
                    <td class="column-2">{{ item.productName }}</td>
                    <td class="column-6">{{ item.productStore }}</td>
                    <td class="column-3">{{ item.productPrice }}원</td>
                    <td class="column-4">{{ item.orderCnt }}</td>
                    <td class="column-5">{{ item.orderSum }}원</td>
                    <td class="column-6">
                    <button type="button" class="close" aria-label="Close" v-on:click="cartDelete(item.orderDetailPk)">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    </td>

                </tr>
            </tbody>
        </table>
        <br>
        <button type="button" class="btn btn-success btn-lg btn-block" v-on:click="moveOrder">구매하기</button>
    </div>
</template>

<script>
export default {
    data() {
        return {
            orderDetailPk: 0,
            cartLists: [],
            customerPk: 0
        };
    },
    methods: {
        moveOrder() {
            this.$router.push({
                name: "Order",
                query: { customerPk: sessionStorage.getItem("customerPk") },
            });
        },
        cartDelete(orderDetailPk) {
            let obj = this;
            // obj.orderDetailPk = obj.$route.query.orderDetailPk;

            // this.$axios.delete('http://localhost:9000/cartDelete', {
            this.$axios.delete('http://18.222.233.235:9000/cartDelete', {
                params: {
                    orderDetailPk: orderDetailPk
                }
            })
            .then(function() {
                console.log("비동기 통신 성공");
                obj.$router.go(obj.$router.currentRouter);
            })
            .catch(function(err) {
                console.log("비동기 통신 실패");
                console.log(err);
            });
        }
    },
    mounted() {
        let obj = this;
        // obj.$axios.get("http://localhost:9000/cartList", {
        obj.$axios.get("http://18.222.233.235:9000/cartList", {
                params: {
                    customerPk: sessionStorage.getItem("customerPk"), // 상품 코드 입력부분이 현재 개발되지 않음
                },
            })
            .then(function (res) {
                console.log("axios로 비동기 통신 성공");
                obj.cartLists = res.data;
            })
            .catch(function (err) {
                console.log("axios 비동기 통신 오류");
                console.log(err);
            });
    }
};
</script>

<style scoped>
#myimg {
    width: 100px;
    height: 100px;
    border-radius: 100px;
}
td {
    text-align: center;
    vertical-align: middle;
}
th {
    text-align: center;
    vertical-align: middle;
}

table {
    width: 1000px;
    margin: 50px auto 100px auto;
}
button {
    margin-bottom: 50px;
}
</style>