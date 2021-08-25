<template>
    <div class="container mr-auto">
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
                    <th class="column-3">가격</th>
                    <th class="column-4">수량</th>
                    <th class="column-5">총합계</th>
                </tr>
            </thead>
            <tbody>
                <tr class="">
                    <td class="column-1">
                        <img id="myimg" src="../assets/cherry.jpeg">
                        <!-- <div class="cart-img-product" @click="delItem(item.id)">
                            <img :src="item.image" alt="IMG-PRODUCT">
                            데이터 연결 후, 클릭하면 장바구니에서 아이템이 삭제되도록
                        </div> -->
                    </td>
                    <td class="column-2">상품 이름 가져오기</td> 
                        <!-- <td class="column-2">{{ item.title }}</td> -->
                    <td class="column-3">상품 가격 가져오기</td>
                        <!-- <td class="column-3">${{ item.price }}</td> -->
                    <td class="column-4">
                        버튼 넣고 상품 수량 증가 감소 스크립트
                        <!-- <div >
                            <button class="btn-num-product-down" @click="decrease(item.id)">
                            <i class="fs-12 fa fa-minus" aria-hidden="true"></i>
                            </button> 감소버튼

                            수량 넣어주고
                            <input class="size8 num-product" type="number" name="num-product1" :value="item.qty">

                            <button class="btn-num-product-up " @click="increase(item.id)">
                            <i class="fs-12 fa fa-plus" aria-hidden="true"></i>
                            </button> 증가버튼
                        </div> -->
                    </td>
                    <td class="column-5">상품 총합계 가져오기</td>
                        <!-- <td class="column-5">${{ item.price }}</td> -->
                </tr>
            </tbody>
        </table>
        <br>
        <button type="button" class="btn btn-success btn-lg btn-block">구매하기</button>
    </div>
</template>

<script>
export default {
    
    // 카트 아이템 추가, 삭제
    // 수량 증가, 감소 스크립트 필요
    //     computed: {
    //         'cart', {
    //         cartItems: state => state.items
    //       })
    //     },
    //     methods: {
    //       delItem(id) {
    //         this.$store.dispatch('cart/delItem', id);
    //       },
    //       increase(id) {
    //         this.$store.dispatch('cart/increaseQty', id);
    //       },
    //       decrease(id) {
    //         this.$store.dispatch('cart/decreaseQty', id);
    //       }
    //     }
    //   }
}
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
    margin: auto;
}
</style>