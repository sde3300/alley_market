<template>
    <main>
        <section class="">
            
            
        </section>

        <div class="album py-5">
            <div class="container">
                <h2 class="main-title py-4">식품에 대한 검색 결과입니다. </h2>

                <!-- 포토앨범 -->
                <div class="row">
                    <div id="photoAlbum"
                        class="card mb-4 box-shadow"
                        v-for="item in items"
                        v-bind:key="item.productPk"
                        style="margin-left: 20px; margin-left: 20px; width: 260px;"
                        v-on:click="productDetail(item.productPk)"
                    >

                        <div class="img"> <div class="scale">
                        <img
                            class="card-img-top"
                            alt="Thumbnail [100%x225]"
                            style="height: 270px; width: 270px; display: block"
                            v-bind:src="item.storedFilePath"
                            data-holder-rendered="true"
                        />
                        </div></div>

                        <div class="card-body">
                            <p class="card-text"></p>
                            <h5>{{ item.productName }}</h5>
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
            // .get("http://localhost:9000/productb4")
            .get("/productb4")
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
</style>