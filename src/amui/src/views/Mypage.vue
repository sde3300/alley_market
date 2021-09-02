<template>
    <div class="container mr-auto">
        <div class="jumbotron text-center">
            <h1>마이페이지</h1>
        </div>
        <hr>
        <table class="table">
            <thead>
                <tr>
                <th></th>
                <th>상품명</th>
                <th id="th3" scope="col">가게이름</th>
                <th id="th2" scope="col">가격</th>
                <th id="th3" scope="col">수량</th>
                <th id="th3" scope="col">총합계</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="item in myPageOrders" v-bind:key="item.orderPk">
                    <th id="th1" scope="row">
                        <!--210902 사진불러오기 추가 -->
                        <img
                            id="myimg"
                            alt="localhost9000으로확인"
                            style=""
                            v-bind:src="item.storedFilePath"
                            data-holder-rendered="true"
                        />
                    </th>
                    <td>{{ item.productName }}</td>
                    <td>{{ item.productStore }}</td>
                    <td>{{ item.productPrice }}원</td>
                    <td>{{ item.orderCnt }} </td>
                    <td>{{ item.orderSum }}원</td>
                    <td>
                        <button type="button" class="btn btn" id="btnRe">
                            <router-link to="/reviewWrite" id="routerlink">리뷰작성</router-link>
                        </button>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
export default {
    data() {
        return {
            myPageOrders: [],
        
        }
    },
    methods: {
        
    },
    mounted() {
        let obj = this;

        obj.$axios.get("http://localhost:9000/myPageOrder", {
                params: {
                    customerPk: 3, // 상품 코드 입력부분이 현재 개발되지 않음
                },
            })
            .then(function (res) {
                console.log("axios로 비동기 통신 성공");
                obj.myPageOrders = res.data;
            })
            .catch(function (err) {
                console.log("axios 비동기 통신 오류");
                console.log(err);
            });
    },
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
#th1 {
    width: 100px;
}
#th2, #th3, #th4 {
    width: 150px;
}
#th5 {
    width: 150px;
}
#tdbottom {
    border-bottom: 0.8px solid lightgray;
}

#routerlink {
    color: white;
}
</style>