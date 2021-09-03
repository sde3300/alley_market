<template>
    <main>
        <section class="">
            <!-- 캐러셀 -->           
                <div
                    id="myCarousel"
                    class="carousel slide"
                    data-ride="carousel"
                >
                    <!-- 캐러셀 조정-->
                    <ol class="carousel-indicators">
                        <li
                            data-target="#myCarousel"
                            data-slide-to="0"
                            class=""
                        ></li>
                        <li
                            data-target="#myCarousel"
                            data-slide-to="1"
                            class=""
                        ></li>
                        <li
                            data-target="#myCarousel"
                            data-slide-to="2"
                            class="active"
                        ></li>
                    </ol>

                    <div class="carousel-inner">
                        <div class="carousel-item">
                            <img
                                class="first-slide"
                                src="../assets/Carousel/banner1.jpg"
                                alt="First slide"
                                width="가로 길이"
                                height=""
                            />
                            <div class="container">
                                <div
                                    class="carousel-caption text-left"
                                    style="color: black"
                                >
                                    <!-- <h1>캐러셀 헤드라인</h1>
                                    <p>어쩌고 저쩌고 가입하세요</p>
                                    <p>
                                        <a
                                            class="btn btn-lg btn-primary"
                                            href="#"
                                            role="button"
                                            >클릭해서 이동하기</a>
                                    </p> -->
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img
                                class="second-slide"
                                src="../assets/Carousel/banner2.jpg"
                                alt="Second slide"
                            />
                            <div class="container">
                                <div
                                    class="carousel-caption text-right"
                                    style="color: black"
                                >
                                    <!-- <h1>두번째 헤드라인</h1>
                                    <p>쓰려면 쓰고 지우려면 지우고</p>
                                    <p>
                                        <a
                                            class="btn btn-lg btn-primary"
                                            href="#"
                                            role="button"
                                            >버튼으로 클릭</a
                                        >
                                    </p> -->
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item active">
                            <img
                                class="third-slide"
                                src="../assets/Carousel/banner3.jpg"
                                alt="Third slide"
                            />
                            <div class="container">
                                <div
                                    class="carousel-caption text-right"
                                    style="color: black"
                                >
                                    <!-- <h2>검색하세요</h2>
                                    <p>
                                        <a
                                            class="btn btn-lg btn-primary"
                                            href="#"
                                            role="button"
                                            >추후 수정</a
                                        >
                                    </p> -->
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- 캐러셀 앞뒤 클릭-->
                    <a
                        class="carousel-control-prev"
                        href="#myCarousel"
                        role="button"
                        data-slide="prev"
                    >
                        <span
                            class="carousel-control-prev-icon"
                            aria-hidden="true"
                        ></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a
                        class="carousel-control-next"
                        href="#myCarousel"
                        role="button"
                        data-slide="next"
                    >
                        <span
                            class="carousel-control-next-icon"
                            aria-hidden="true"
                        ></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            
            <!-- 캐러셀 끝 -->
        </section>

        <div class="album py-4">
            <div class="container">
                <h2 class="main-title py-4">이런 상품은 어떠세요?</h2>

                <!-- 포토앨범 -->
                <div class="row">
                    <div id="photoAlbum"
                        class="card mb-4 box-shadow"
                        v-for="item in items"
                        v-bind:key="item.productPk"
                        style="margin-left: 20px"
                        v-on:click="productDetail(item.productPk)"
                    >
                        <!--210830 혜수 사진불러오기 추가 -->
                        <div class="img"><div class="scale">
                        <img v-on:click="productDetail(item.productPk)"
                            class="card-img-top"
                            alt="Thumbnail [100%x225]"
                            style="height: 260px; width: 260px; display: block"
                            v-bind:src="item.storedFilePath"
                            data-holder-rendered="true"
                        />
                        </div></div>

                        <div class="card-body">
                            <p class="card-text"></p>
                            <h5>
                                {{ item.productName }}
                            </h5>
                            <h5>{{ item.productPrice }} 원</h5>
                            <div
                                class="
                                    d-flex
                                    justify-content-between
                                    align-items-center
                                "
                            >

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="content p-0"></div>
    </main>
</template>

<script>
export default {
    data() {
        return {
            items: [],
        };
    },

    methods: {
        productDetail(productPk) {
            this.$router.push({
                name: "Detail",
                query: { productPk: productPk },
            });
        },
    },
    mounted() {
        let obj = this;

        obj.$axios
            .get("http://localhost:9000/productIndex")
            .then(function (res) {
                console.log("axios로 비동기 통신 성공");
                obj.items = res.data;
            })
            .catch(function (err) {
                console.log("axios 비동기 통신 오류");
                console.log(err);
            });
    },
};
</script>

<style>
.carousel-fade .carousel-item,
.carousel-item img {
    max-height: 90vh;
    min-height: 50vh;
}
#photoAlbum {
    border: none;
}
</style>