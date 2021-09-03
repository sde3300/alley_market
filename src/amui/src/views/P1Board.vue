<template>
    <main>
        <section class="">
            
            
        </section>

        <div class="album py-5 bg-light">
            <div class="container">
                <h2 class="main-title py-4">밀키트에 대한 검색 결과입니다. </h2>

                <!-- 포토앨범 -->
                <div class="row">
                    <div
                        class="card mb-4 box-shadow"
                        v-for="item in items"
                        v-bind:key="item.productPk"
                        style="margin-left: 20px"
                    >
                        <!--210831 사진불러오기 추가 -->
                        <img v-on:click="productDetail(item.productPk)"
                            class="card-img-top"
                            alt="Thumbnail [100%x225]"
                            style="height: 200px; width: 200px; display: block"
                            v-bind:src="item.storedFilePath"
                            data-holder-rendered="true"
                        />

                        <div class="card-body">
                            <p class="card-text">{{ item.productPk }}</p>
                            <p>
                                {{ item.productName }}
                            </p>
                            <p>{{ item.productPrice }}</p>
                            <div
                                class="
                                    d-flex
                                    justify-content-between
                                    align-items-center
                                "
                            >
                                <div class="btn-group">
                                    <button
                                        type="button"
                                        class="btn btn-sm btn-outline-secondary"
                                    >
                                        View
                                    </button>
                                    <button
                                        type="button"
                                        class="btn btn-sm btn-outline-secondary"
                                    >
                                        Edit
                                    </button>
                                </div>
                                <small class="text-muted">9 mins</small>
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
            .get("http://localhost:9000/productb1")
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