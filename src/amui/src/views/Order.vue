<template>
    <div class="container mr-auto">
        <div class="jumbotron text-center">
            <h1>주문하기</h1>
        </div>
        <hr>
        <!-- 주문내역 표로 보여줌 -->
        <table class="table">
            <thead>
                <tr>
                <th scope="col" colspan="2">구매목록</th>
                <!-- <th scope="col">First</th> -->
                <th id="th2" scope="col">판매자명</th>
                <th id="th3" scope="col">배송비</th>
                <th id="th4" scope="col">상품금액</th>
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
                </tr>
            </tbody>
        </table>
        <!-- 개인정보 입력 부분 -->
        <div class="container">
            <form>
                <div class="form-group">
                    <label for="name"><b>이름</b></label>
                    <input type="text" class="form-control" id="exampleInputName" aria-describedby="nameHelp" placeholder="이름을 입력하세요">
                </div>
                <div class="form-group">
                    <label for="phone"><b>전화번호</b></label>
                    <input type="tel" class="form-control" id="exampleInputPhone" aria-describedby="phoneHelp" placeholder="전화번호를 입력하세요">
                </div>
                <div>
                    <div class="form-group">
                    <label for="address"><b>주소</b></label>
                    </div>
                </div>
                <div>
                    <label for="exampleFormControlSelect1"><b>요청사항</b></label>
                    <select class="form-control" id="exampleFormControlSelect1">
                        <option>요청사항을 선택해주세요</option>
                        <option>배송전에 연락부탁드립니다</option>
                        <option>부재시 경비실에 맡겨주세요</option>
                        <option>문 앞에 놓아주세요</option>
                    </select>
                </div>
                <!-- 결제금액, 결제수단 그리드 부분 -->
                <div class="container">
                    <div class="row">
                        <div class="col-sm">
                            <p><b>결제금액</b></p>
                        </div>
                        <div class="col-sm">
                            <p><b>결제수단</b></p>
                            <div class="col-sm-10">
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
                                <label class="form-check-label" for="gridRadios1">
                                신용 / 체크카드
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
                                <label class="form-check-label" for="gridRadios2">
                                계좌이체
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="option3">
                                <label class="form-check-label" for="gridRadios3">
                                휴대폰
                                </label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios4" value="option4">
                                <label class="form-check-label" for="gridRadios4">
                                무통장결제
                                </label>
                            </div>
                        </div>
                        </div>
                    </div>
                </div>
                <div class="container">
                <button type="submit" class="btn btn-warning btn-lg ">주문하기</button>
                </div>
                </form>
        </div>
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
#tdbottom {
    border-bottom: 0.8px solid lightgray;
}
table {
    width: 1000px;
    margin: auto;
}
</style>