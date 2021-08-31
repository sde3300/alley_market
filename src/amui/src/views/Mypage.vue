<template>
    <div class="container mr-auto">
        <div class="jumbotron text-center">
            <h1>마이페이지</h1>
        </div>
        <hr>
        <table class="table">
            <thead>
                <tr>
                <th scope="col" colspan="2">구매목록</th>
                <!-- <th scope="col">First</th> -->
                <th id="th2" scope="col">판매자명</th>
                <th id="th3" scope="col">배송비</th>
                <th id="th4" scope="col">상품금액</th>
                <th id="th5" scope="col"></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th id="th1" scope="row">
                        <img id="myimg" src="../assets/cherry.jpeg">
                    </th>
                    <td>
                        <h6>가게이름 ***</h6>
                        <h6>상품명 ***</h6>
                        <h6>상품상세내용 ***</h6>
                    </td>
                    <td>판매자명</td>
                    <td>배송비</td>
                    <td>상품금액</td>
                    <td>
                        <button type="button" class="btn btn" id="btnRe">
                            <router-link to="/reviewWrite" id="routerlink">리뷰작성</router-link>
                        </button>
                    </td>
                </tr>
                <tr>
                    <th id="th1" scope="row">
                        <img id="myimg" src="../assets/cherry.jpeg">
                    </th>
                    <td>
                        <h6>가게이름 ***</h6>
                        <h6>상품명 ***</h6>
                        <h6>상품상세내용 ***</h6>
                    </td>
                    <td>판매자명</td>
                    <td>배송비</td>
                    <td>상품금액</td>
                    <td>
                        <button type="button" class="btn btn" id="btnRe">
                            <router-link to="/reviewWrite" id="routerlink">리뷰작성</router-link>
                        </button>
                    </td>
                </tr>
                <tr id="tdbottom">
                    <th id="th1" scope="row">
                        <img id="myimg" src="../assets/cherry.jpeg">
                    </th>
                    <td>
                        <h6>가게이름 ***</h6>
                        <h6>상품명 ***</h6>
                        <h6>상품상세내용 ***</h6>
                    </td>
                    <td>판매자명</td>
                    <td>배송비</td>
                    <td>상품금액</td>
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