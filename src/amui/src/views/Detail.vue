<template>
    <section class="jumbotron text-center">
        <div class="container">
            <div class="container-sm">
                <div class="row" style="margin-bottom: 50px">
                    <div class="col-6" id="detailPic">
                        <img
                            src="https://shop.hansalim.or.kr/im/is/activeDesigner/050307006_content1.jpg"
                            class="rounded float-left"
                            alt="..."
                            width="500px"
                            height="400px"
                        />
                    </div>

                    <div class="col-6" id="detailText">
                        <div class="container">
                            <div class="row text-left">
                                <div class="col-8">
                                    <h1>완숙토마토(2kg)</h1>
                                </div>
                                <div class="col text-right">
                                    <!--  공유하는 링크 넣기 -->
                                    <i
                                        class="
                                            fas
                                            fa-3x fa-external-link-square-alt
                                        "
                                    ></i>
                                </div>
                            </div>

                            <div class="row text-left">
                                <div class="col-4">
                                    <h2>9,000원</h2>
                                </div>
                                <div class="col"></div>
                                <div class="col"></div>
                            </div>
                            <hr />
                            <div class="row">
                                <div class="col" id="detailtext">공급유형</div>
                                <div class="col"></div>
                                <div class="col-6" style="text-align: left">
                                    일반공급
                                </div>
                            </div>
                            <div class="row">
                                <div class="col" id="detailtext">보관방법</div>
                                <div class="col"></div>
                                <div class="col-6" style="text-align: left">
                                    냉장
                                </div>
                            </div>
                            <div class="row">
                                <div class="col" id="detailtext">혜택</div>
                                <div class="col"></div>
                                <div class="col-6" style="text-align: left">
                                    결제 시 135원 적립 예상
                                </div>
                            </div>
                            <div class="row">
                                <div class="col" id="detailtext">
                                    알레르기 성분
                                </div>
                                <div class="col"></div>
                                <div class="col-6" style="text-align: left">
                                    토마토
                                </div>
                            </div>
                            <div class="row">
                                <div class="col" id="detailtext">구매수량</div>
                                <div class="col"></div>
                                <div class="col-6" style="text-align: left">
                                    카운팅 하는 스트립트 넣기
                                </div>
                            </div>
                            <hr />
                            <div class="row">
                                <div
                                    class="col text-left"
                                    style="font-weight: bold"
                                >
                                    총 물품금액
                                </div>
                                <div class="col-6">
                                    (갯수에 따른 가격/ 스크립트)
                                </div>
                                <div class="col"></div>
                            </div>
                            <div class="row" style="margin-top: 50px">
                                <div class="col-2" style="text-right">
                                    <i class="fab fa-2x fa-gratipay"></i>
                                    <!-- 찜하기 버튼? 모달창?-->
                                </div>
                                <div class="col-10">
                                    <button
                                        type="button"
                                        class="btn btn-success btn-lg btn-block"
                                    >
                                        장바구니
                                    </button>
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
                    <h1>골목시장이 전하는 물품이야기</h1>
                    <br />
                    <hr />
                    <p2 id="p2tag"><i class="fab fa-envira"></i>생산지</p2
                    ><br />
                    <p3 id="p3tag">청주청원, 아산, 홍천 외</p3><br />

                    <br /><p2 id="p2tag"><i class="fab fa-envira"></i>중량</p2
                    ><br />
                    <p3 id="p3tag">2kg</p3><br />

                    <br /><p2 id="p2tag"
                        ><i class="fab fa-envira"></i>재배방법</p2
                    ><br />
                    <p3 id="p3tag">무농약 이상</p3><br />

                    <br /><p2 id="p2tag"><i class="fab fa-envira"></i>특징</p2
                    ><br />
                    <p3 id="p3tag"
                        >골목시장 토마토는 완숙한 상태로 수확해도 육질이 단단한
                        품종으로 재배하였기에,토마토 고유의 풍부한 맛과 향을
                        듬뿍 느끼실 수 있습니다. 가장 맛있는 품질로 공급해
                        드리기 위해 완숙된 토마토만을 수확합니다. 골목시장
                        토마토는 인위적인 수정이 아닌 벌에 의한 수정으로 열매를
                        맺게 하며, 과실의 크기를 키우기 위한 생장조절제를
                        사용하지 않아 상대적으로 크기는 작을 수 있지만 속이 꽉
                        차 있습니다. 수확한 다음날 바로 공급해 드리기 때문에
                        수확 직후의 신선한 토마토를 그대로 맛보실 수 있습니다.
                        토마토의 붉은색을 내는 색소인 리코펜은 탁월한 항암제로,
                        익혀 드시면 몸에 흡수가 더 잘됩니다. 생즙은 피를 맑게
                        하는 효과가 있어 동맥경화와 간장병에 매우 좋습니다.
                        펙틴이라는 성분이 장 속에 있는 음식물을 빨리 배설시켜,
                        장에 독성이 있어 생기는 기미, 여드름 등을 예방합니다
                        지방질이 많은 음식의 소화를 돕는 작용을 하기 때문에 육식
                        등 산성식품을 많이 드시는 분들에게 좋습니다. 칼로리가
                        낮으면서도 포만감이 커서 다이어트 식품으로도
                        좋습니다.</p3
                    ><br />

                    <br /><p2 id="p2tag"
                        ><i class="fab fa-envira"></i>이용방법</p2
                    ><br />
                    <p3 id="p3tag"
                        >그냥 드셔도 좋고 갈거나 즙을 내어서 드셔도 좋습니다
                        요리의 곁들임이나 잼, 샐러드, 스튜, 미트소스 등에
                        사용됩니다. 토마토 특유의 풋내는 비린내를 없애는 작용을
                        하기 때문에 고기와 함께 삶으면 잡내를 없애줍니다.</p3
                    ><br />

                    <br /><p2 id="p2tag"
                        ><i class="fab fa-envira"></i>보관방법</p2
                    ><br />
                    <p3 id="p3tag">냉장보관</p3><br />

                    <br /><p2 id="p2tag"
                        ><i class="fab fa-envira"></i>포장 이야기</p2
                    ><br />
                    <p3 id="p3tag"
                        >농산물 상자는 표백하지 않은 펄프 원지(UKP : Unbleached
                        Kraft Pulp)를 사용하고 있습니다. 물품명, 로고 등을
                        상자에 인쇄할 때 환경에 덜 유해한 수성잉크를 사용하고,
                        불필요한 잉크 소비를 줄이기 위해 인쇄도수를 2도 내로
                        적용하고 있습니다. (2019년부터 재고 소진 후 순차 적용)
                        사용 후 일반 종이쓰레기로 분리배출해주세요.</p3
                    ><br />

                    <br /><p2 id="p2tag"><i class="fab fa-envira"></i>원재료</p2
                    ><br />
                    <p3 id="p3tag">완숙토마토</p3><br />
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
                                    data-target="#collapseExample1"
                                    aria-expanded="false"
                                    aria-controls="collapseExample"
                                >
                                    {{ item.reviewTitle }}
                                </div>
                                <br />
                                <div class="collapse" id="collapseExample1">
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

                    <button type="button" class="btn btn btn-outline-secondary btn-lg btn-block" v-on:click="qnaInsert">
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
                                    data-target="#collapseExample4"
                                    aria-expanded="false"
                                    aria-controls="collapseExample"
                                >
                                    {{ item.qnaTitle }}
                                </div>
                                <br />
                                <div class="collapse" id="collapseExample4">
                                    <div class="card card-body">
                                        {{ item.qnaContents }}
                                    </div>
                                    <div class="collapse" id="collapseExample4">
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
            qnaPk: 0,
            qnaTitle: "",
            qnaContents: "",
            createId: "",
            createDate: "",
            qnas: [],
            reviews: [],
        }
    },
    methods: {
        reviewRead(reviewPk) {
            this.$router.push({
                name: "Detail",
                params: { reviewPk: reviewPk },
            });
        },

        qnaRead(qnaPk) {
            this.$router.push({ name: "Detail", params: { qnaPk: qnaPk } });
        },

        qnaInsert() {
        let obj = this;
        obj.$axios.post("http://localhost:9000/qnaInsert", {
                productPk: this.productPk,
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
    },

    mounted() {
        let obj = this;
        obj.seq = obj.$route.query.seq;

        obj.$axios
            .get("http://localhost:9000/reviewRead", {
                params: {
                    productPk: 1, // 상품 코드 입력부분이 현재 개발되지 않음
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
                    productPk: 1, // 상품 코드 입력부분이 현재 개발되지 않음
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

