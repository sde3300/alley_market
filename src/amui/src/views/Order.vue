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
                <th></th>
                <th>상품명</th>
                <th id="th3" scope="col">가게이름</th>
                <th id="th2" scope="col">가격</th>
                <th id="th3" scope="col">수량</th>
                <th id="th3" scope="col">총합계</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="item in cartLists" v-bind:key="item.customerPk">
                    <th id="th1" scope="row">
                            <img id="myimg"
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
                </tr>
            </tbody>
        </table>

        <hr>
        <br>
        <!-- 개인정보 입력 부분 -->
        <div class="container">
            <form>
                <div>
                    <div class="form-group">
                    <label for="address"><b>배송지</b></label>
                        <div class="daummap">
                            <div class="form-group row">
                                <div class="col">
                                    <div class="row">
                                        <label for="zip" class="col-sm-4 col-form-label">우편번호</label>
                                        <input type="text" class="form-control col" id="zip" name="zip" placeholder="우편번호" v-model="zip">
                                    </div>
                                </div>
                                <div class="col">
                                    <button class="btn btn-secondary" @click="showApi">주소검색</button> </div>
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col">
                                    <div class="row">
                                        <label for="addr1" class="col-sm-4 col-form-label">주소</label>
                                        <input type="text" class="form-control col" id="addr1" name="addr1" placeholder="주소" v-model="addr1">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="row">
                                        <label for="addr2" class="col-sm-3 col-form-label">상세주소</label>
                                        <input type="text" class="form-control col" id="addr2" name="addr2" placeholder="상세주소를 입력해주세요" v-model="addr2">
                                    </div>
                                </div>
                            </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="orderName"><b>받는 사람</b></label>
                    <input type="text" class="form-control" id="orderName" name="orderName" placeholder="이름을 입력하세요" v-model="orderName">
                </div>
                <div class="form-group">
                    <label for="orderPhone"><b>휴대폰 번호</b></label>
                    <input type="text" class="form-control" id="orderPhone" name="orderPhone" placeholder="휴대폰 번호를 입력하세요" v-model="orderPhone">
                </div>
                <div>
                    <label for="orderAsk"><b>요청사항</b></label>
                    <!-- <select class="form-control" id="orderAsk" name="orderAsk" v-model="orderAsk"> 
                        <option selected>Open this select menu</option> 
                        <option value="1">무인택배함에 맡겨주세요</option>
                        <option value="2">배송전에 연락부탁드립니다</option>
                        <option value="3">부재시 경비실에 맡겨주세요</option>
                        <option value="4">문 앞에 놓아주세요</option>
                    </select> -->

                    <select class="custom-select custom-select-sm" v-model="orderAsk">
                        <option selected>요청사항을 선택해주세요</option>
                        <option value="1">배송전에 연락부탁드립니다</option>
                        <option value="2">부재시 경비실에 맡겨주세요</option>
                        <option value="3">문 앞에 놓아주세요</option>
                        <option value="4">무인택배함에 맡겨주세요</option>
                    </select>
                </div>
                
                <br>
                <!-- 결제금액, 결제수단 그리드 부분 -->
                <div class="container">
                    <div class="row">
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
                        <div class="col-sm">
                            <p><b>결제상세</b></p>
                            <div class="row">
                                <div class="col">상품금액</div> 
                                <div class="col">{{ totalAdd() }}원</div>
                            </div>
                            <div class="row">
                                <div class="col">배송비</div> 
                                <div class="col">2500원</div> 
                            </div>
                            <hr>
                            <div class="row">
                            <div class="col"><h5>총 결제금액</h5></div>
                            <div class="col"><h5>{{ totalAddDelivery() }}원</h5></div>
                            </div>
                            
                        </div>
                    </div>
                </div>
                <hr>
                <button type="submit" class="btn btn-warning btn-lg" v-on:click="orderInsert">주문하기</button>

                </form>
        </div>
    </div>
</template>

<script>
export default {
    name: 'daumMap',
    data() { 
        return { 
            zip: "", 
            addr1: "", 
            addr2: "",
            orderName: "",
            orderPhone: "",
            orderDate: "",
            orderAsk: 0,
            totalPrice: "",
            totalPriceDelivery: "",
            orderProducts: [],
            cartLists: [],
            } 
    }, 
    methods: {
        showApi() { 
            new window.daum.Postcode({ 
                oncomplete: (data) => { 
                    // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분. 
                    
                    // 도로명 주소의 노출 규칙에 따라 주소를 조합한다. 
                    // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다. 
                    let fullRoadAddr = data.roadAddress; // 도로명 주소 변수 
                    let extraRoadAddr = ''; // 도로명 조합형 주소 변수 
                    
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외) 
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다. 
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){ 
                        extraRoadAddr += data.bname; 
                        } 
                    // 건물명이 있고, 공동주택일 경우 추가한다. 
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName); 
                        } 
                    
                    // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다. 
                    
                    if(extraRoadAddr !== ''){ 
                        extraRoadAddr = ' (' + extraRoadAddr + ')'; 
                        } 
                    
                    // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다. 
                    if(fullRoadAddr !== ''){ 
                        fullRoadAddr += extraRoadAddr; 
                        } 
                    
                    // 우편번호와 주소 정보를 해당 필드에 넣는다. 
                    this.zip = data.zonecode; //5자리 새 우편번호 사용 
                    this.addr1 = fullRoadAddr; 
                } 
            }).open()
        },
        orderProduct(orderPk) {
            this.$router.push({
                name: "Order",
                params: { orderPk: orderPk },
            });
        },
        orderInsert() {
            let obj = this;
            obj.$axios.post('http://localhost:9000/orderInsert', {
                orderName: this.orderName,
                orderPhone: this.orderPhone,
                zip: this.zip,
                addr1: this.addr1,
                addr2: this.addr2,
                orderDate: this.orderDate,
                orderAsk: this.orderAsk,
                totalPrice: this.totalPrice,
                totalPriceDelivery: this.totalPriceDelivery,
            })
            .then(function() {
                console.log('비동기 통신 성공');
                obj.$router.go({ name: 'Main' });
                alert("주문이 완료되었습니다");
            })
            .catch(function(err) {
                console.log("비동기 통신 실패");
                console.log(err);
            });
        },
        totalAdd() {
            let total = 0;
            if (this.cartLists.length > 0) {
                for (let i = 0; i < this.cartLists.length; i++) {
                    total += this.cartLists[i].orderSum;
                }
            }
            this.totalPrice = total;
            return this.totalPrice;
        },
        totalAddDelivery() {
            let total = 0;
            if (this.cartLists.length > 0) {
                for (let i = 0; i < this.cartLists.length; i++) {
                    total += this.cartLists[i].orderSum;
                }
            }
            this.totalPriceDelivery = total + 2500;
            return this.totalPriceDelivery;
        }
    },
    mounted() {
        let obj = this;

        obj.$axios
            .get("http://localhost:9000/cartList", {
                params: {
                    customerPk: 1, // 상품 코드 입력부분이 현재 개발되지 않음
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