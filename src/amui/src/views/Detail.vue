<template>
    <section class="jumbotron text-center">
        <div class="container">
            <div class="container-sm">
                <div class="row" style="margin-bottom: 50px">
                    <div class="col-6" id="detailPic" >
                        <img
                            v-bind:src="storedFilePath"
                            class="rounded float-left"
                            alt="http://localhost:9000/#/에서 확인"
                            width="500px"
                            height="400px"
                        />
                        
                    </div>

                    <div class="col-6" id = "detailText">
                        <div class="container">
                            <div class="row text-left" >
                                <div class="col-8" >
                                <h1>{{ productName }}</h1>
                                </div>
                                <div class="col text-right">
                                <!--  공유하는 링크 넣기 -->
                                <i class="fas fa-3x fa-external-link-square-alt"></i> 
                                </div>
                            </div>

                            <div class="row text-left">
                                <div class="col-4">
                                <h2>{{ productPrice }} 원</h2>
                                </div>
                                <div class="col">
                                </div>
                                <div class="col">                           
                                </div>
                            </div>
                        <hr/>
                            <div class="row">
                                <div class="col" id="detailtext">
                                상품번호 
                                </div>
                                <div class="col"></div>
                                <div class="col-6" style="text-align:left">
                                {{ productPk }}
                                </div>
                            </div>
                            <div class="row">
                                <div class="col" id="detailtext">
                                판매처 
                                </div>
                                <div class="col"></div>
                                <div class="col-6" style="text-align:left">
                                {{ productStore }}
                                </div>
                            </div>
                            <div class="row">
                                <div class="col" id="detailtext">
                                남은 수량
                                </div>
                                <div class="col"></div>
                                <div class="col-6" style="text-align:left">
                                {{ productStockCnt }}
                                </div>
                            </div>

                            <div class="row">
                                <div class="col" id="detailtext">
                                구매수량
                                </div>
                                <div class="col"></div>
                                <div class="col-6" style="text-align:left">
                                <form name="form" method="get">
                                수량 : 
                                <input type="button" value=" - " v-on:click="priceDel()">
                                <input type="text" name="amount" value="1" size="1" readonly v-model="orderCnt">
                                <input type="button" value=" + " v-on:click="priceAdd()">
                                </form>
                                </div>
                            
                            </div>
                        <hr/>
                            <div class="row">
                                <div class="col-5 text-left" id="detailtext" style="font-weight:bold">
                                총 물품금액
                                </div>
                                <div class="col-6">
                                <input type="text" name="totalPrice" size="11" readonly v-model="orderSum">원
                                </div>
                                <div class="col">
                                </div>
                            </div>
                            <div class="row" style="margin-top:50px">
                                <div class="col-2" style="text-right">
                                <!-- <i class="fab fa-2x fa-gratipay"></i> -->
                                <!-- 찜하기 버튼? 모달창?-->
                                </div>
                                <div class="" style="margin:auto">
                                    <button type="button" class="btn btn-success btn-lg" v-on:click="cartInsert" style="margin-right:10px">장바구니</button>
                                    <button type="button" class="btn btn-danger btn-lg" v-on:click="moveOrder">주문하기</button>
                                </div>
                            </div>
                    </div>
                </div>
            </div>
        </div>

            <div class="d-flex bg-dark" id="btnStyle">
                <div class="btn flex-fill text-white py-3 px-4">
                    <a href="#info">물품정보</a>
                </div>
                <div class="btn flex-fill text-white py-3 px-4">
                    <a href="#reviews">이용후기</a>
                </div>
                <div class="btn flex-fill text-white py-3 px-4">
                    <a href="#qna">물품문의</a>
                </div>
            </div>

            <!-- 물품 정보 -->
            <div id="info" class="bg-light text-dark text-left px-3 py-4">
                <div class="container" style="margin-top: 30px">
                    {{ productDetail }}
                </div>
            </div>

            <!-- 이용 후기 -->
            <div class="table-responsive" id="reviews">
                <div class="jumbotron text-left">
                    <h1><b>이용후기</b></h1>
                    <br />물품 이용 후 1개월 이내에 후기를 작성할 수
                    있습니다.<br />
                    일반문의, 물품 관련 질문은 물품문의 게시판에 남겨주시면
                    담당자가 답변해드리겠습니다.
                    <div
                        class="container"
                        id="re_purchase"
                        style="margin-top: 50px"
                    >
                        <div class="row">
                            <div class="col">
                                재구매 별점<br /><br />

                                <p><b>재구매의사 있어요</b></p>
                                <br />
                                <div
                                    class="progress-bar"
                                    role="progressbar"
                                    style="width: 75%"
                                    aria-valuenow="75"
                                    aria-valuemin="0"
                                    aria-valuemax="100"
                                >
                                    75%
                                </div>
                            </div>
                            <div class="col">
                                <i class="far fa-smile"></i> 추천해요10
                                <!-- 평균 값 넣기? -->
                                <i class="far fa-angry"></i> 아쉬워요7
                            </div>
                        </div>
                    </div>
                </div>

                <table class="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>No.</th>
                            <th>글 제목</th>
                            <th>작성자</th>
                            <th>작성 날짜</th>
                            <th>별점</th>
                        </tr>
                    </thead>
                    <tbody>
                        <!-- v-for = "item in items" v-bind:key = "item.productPk" -->
                        <!-- <tr v-on:click="reviewRead(item.reviewPk)"> -->
                        <tr v-for="item in reviews" v-bind:key="item.reviewPk">
                            <td>{{ item.reviewPk }}</td>
                            <td>
                                <div
                                    class=""
                                    type=""
                                    data-toggle="collapse"
                                    v-bind:data-target="
                                        '#review' + item.reviewPk
                                    "
                                    aria-expanded="false"
                                    aria-controls="collapseExample"
                                >
                                    {{ item.reviewTitle }}
                                </div>
                                <br />
                                <div
                                    class="collapse"
                                    v-bind:id="'review' + item.reviewPk"
                                >
                                    <div class="card card-body">
                                        {{ item.reviewContents }}
                                    </div>
                                </div>
                            </td>

                            <td>{{ item.createId }}</td>
                            <td>{{ item.createDate }}</td>
                            <td>{{ item.reviewScore }}</td>
                        </tr>
                    </tbody>
                </table>
            </div>

            <!-- 물품 문의 -->
            <div class="table-responsive" id="qna">
                <div class="jumbotron text-left">
                    <h1><b>물품문의</b></h1>
                    <br />
                    <h5>
                        <b
                            >물품에 대한 궁금하신 점이나 서비스 이용에 불편한
                            점이 있으신가요?</b
                        >
                    </h5>
                    문제가 되거나 궁금한 사항 등을 남겨주시면 정성껏
                    빠르게답변해드리겠습니다.<br />
                    작성해주신 문의내역 및 답변은 나의페이지 > 상담내역 메뉴에서
                    확인 가능합니다.<br />
                    해당 게시판의 성격과 다른 글은 사전 동의 없이 이동하거나
                    외부 광고성 글은 삭제하고 있으니 양해를 부탁드립니다.<br />
                    <br />

                    <div class="row">
                        <div class="col-md mx-auto text-left">
                            <div class="form-group">
                                <input
                                    type="text"
                                    class="form-control"
                                    id="qnaTitle"
                                    name="qnaTitle"
                                    placeholder="문의제목을 입력하세요"
                                    v-model="qnaTitle"
                                    size="1"
                                />
                            </div>
                            <div class="form-group">
                                <textarea
                                    name="qnaContents"
                                    id="qnaContents"
                                    cols="50"
                                    rows="5"
                                    class="form-control"
                                    placeholder="문의내용을 입력하세요"
                                    v-model="qnaContents"
                                ></textarea>
                            </div>
                            <div class="form-group">
                                <input
                                    type="text"
                                    class="form-control"
                                    id="createId"
                                    name="createId"
                                    placeholder="아이디를 입력하세요"
                                    v-model="createId"
                                    size="1"
                                />
                            </div>
                        </div>
                    </div>

                    <button
                        type="button"
                        class="btn btn btn-outline-secondary btn-lg btn-block"
                        v-on:click="qnaInsert"
                    >
                        문의 작성
                    </button>
                </div>

                <table class="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>No.</th>
                            <th>글 제목</th>
                            <th>작성자</th>
                            <th>작성 날짜</th>
                            <th>답변 여부</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="item in qnas" v-bind:key="item.qnaPk">
                            <!-- v-for로  -->
                            <td>{{ item.qnaPk }}</td>
                            <td>
                                <div
                                    class=""
                                    type=""
                                    data-toggle="collapse"
                                    v-bind:data-target="'#qna' + item.qnaPk"
                                    aria-expanded="false"
                                    v-bind:aria-controls="'qna' + item.qnaPk"
                                >
                                    {{ item.qnaTitle }}
                                </div>
                                <br />
                                <div
                                    class="collapse"
                                    v-bind:id="'qna' + item.qnaPk"
                                >
                                    <div class="card card-body">
                                        {{ item.qnaContents }}
                                    </div>
                                    <!-- <div class="collapse" id="'qna' + item.qnaPk"> -->
                                    <div>
                                        <div class="card card-body">
                                            {{ item.answerContents }}
                                        </div>
                                    </div>
                                </div>
                            </td>
                            <td>{{ item.createId }}</td>
                            <td>{{ item.createDate }}</td>
                            <td>{{ item.answerYn }}</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </section>
</template>


<script>
export default {
    data() {
        return {
            productPk: 0,
            productName: "",
            productPrice: "",
            orderSum: 0,
            orderCnt: 0,
            productStockCnt: "",
            productStore: "",
            productDetail: "",
            qnaTitle: "",
            qnaContents: "",
            createId: "",
            qnas: [],
            reviews: [],
            items: [],
        };
    },
    methods: {
        // productDetail(productPk) {
        // this.$router.push({ name: 'Detail', query: {productPk: productPk}
        //     });
        // },
        moveOrder(productPk) {
            this.$router.push({
                name: "Order",
                query: { productPk: productPk },
            });
        },
        moveCart(productPk) {
            this.$router.push({
                name: "CartCartList",
                query: { productPk: productPk },
            });
        },
        reviewRead(reviewPk) {
            this.$router.push({
                name: "Detail",
                params: { reviewPk: reviewPk },
            });
        },

        qnaRead(qnaPk) {
            this.$router.push({ name: "Detail", params: { qnaPk: qnaPk }});
        },

        qnaInsert() {
            let obj = this;
            obj.$axios
                .post("http://localhost:9000/qnaInsert", {
                    productPk: this.qnaPk,
                    qnaTitle: this.qnaTitle,
                    qnaContents: this.qnaContents,
                    createdDate: this.createdDate,
                    createId: this.createId,
                })
                .then(function () {
                    console.log("비동기 통신 성공");
                    obj.qnaContents = "";
                    obj.$router.go(obj.$router.currentRouter);
                })
                .catch(function (err) {
                    console.log("비동기 통신 실패");
                    console.log(err);
                });
        },

        cartInsert() {
            let obj = this;
            obj.$axios
                .post("http://localhost:9000/cartInsert", {
                    productPk: this.productPk,
                    orderCnt: this.orderCnt,
                    orderSum: this.orderSum,
                    orderPk: this.orderPk,
                })
                .then(function () {
                    console.log("비동기 통신 성공");
                    obj.qnaContents = "";
                    obj.$router.go(obj.$router.currentRouter);
                })
                .catch(function (err) {
                    console.log("비동기 통신 실패");
                    console.log(err);
                });
        },

        priceAdd() {
            this.orderSum += this.productPrice;
            this.orderCnt ++ ;
        },
        priceDel() {
            this.orderSum -= this.productPrice;
            this.orderCnt -- ;
        },
    },

    mounted() {
        let obj = this;
        obj.productPk = obj.$route.query.productPk;

        obj.$axios.get("http://localhost:9000/productDetail", {
            params: {
                productPk: obj.$route.query.productPk,
                },
            })
            .then(function(res) {
                console.log("axios로 비동기 통신 성공");

                obj.productPk = res.data.productPk;
                obj.productName = res.data.productName;
                obj.productPrice = res.data.productPrice;
                obj.productStockCnt = res.data.productStockCnt;
                obj.productStore = res.data.productStore;
                obj.productDetail = res.data.productDetail;
                //혜수추가
                obj.storedFilePath = res.data.storedFilePath;
                obj.originalFileName = res.data.originalFileName;

            })
            .catch(function(err) {
                console.log("axios 비동기 통신 오류");
                console.log(err);
            });

        obj.$axios.get("http://localhost:9000/reviewRead", {
                params: {
                    productPk: obj.productPk,
                },
            })
            .then(function (res) {
                console.log("axios로 비동기 통신 성공");
                obj.reviews = res.data;
            })
            .catch(function (err) {
                console.log("axios 비동기 통신 오류");
                console.log(err);
            });

        obj.$axios
            .get("http://localhost:9000/qnaRead", {
                params: {
                    productPk: obj.productPk,
                },
            })
            .then(function (res) {
                console.log("axios로 비동기 통신 성공");
                obj.qnas = res.data;
            })
            .catch(function (err) {
                console.log("axios 비동기 통신 오류");
                console.log(err);
            });
    },
};
</script>

<style>
#detailtext {
    text-align: left;
    font-weight: bold;
    color: gray;
    margin-bottom: 30px;
}
#p2tag {
    font-weight: bold;
    font-size: 40px;
    margin-bottom: 50px;
}

#p3tag {
    font-weight: bold;
    font-size: 15px;
    color: gray;
    margin: auto;
}

#btnStyle {
    text-decoration: none;
    text-decoration-color: aliceblue;
    text-decoration: underline none;
}
</style>

