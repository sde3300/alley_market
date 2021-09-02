<template>
    <div class="container mr-auto">
        <div class="jumbotron text-center">
            <h1>이용후기</h1>
        </div>
        <!-- <hr> -->
        <div class="container" id="reviewwri">
            <form>
                <div class="form-group row">
                    <div class="col-5">
                        <div class="row">
                            <label for="inputStar" class="col-sm-5 col-form-label">만족도</label>
                            <select id="inputStar" class="form-control col" v-model="reviewScore">
                                <option selected>만족도를 선택하세요</option>
                                <option value="5">★★★★★</option>
                                <option value="4">★★★★☆</option>
                                <option value="3">★★★☆☆</option>
                                <option value="2">★★☆☆☆</option>
                                <option value="1">★☆☆☆☆</option>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="text" class="col-sm-2 col-form-label">제목</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="제목을 입력하세요" v-model="reviewTitle">
                    </div>
                </div>

                <div class="form-group row">
                    <label for="text" class="col-sm-2 col-form-label">내용</label>
                    <div class="col-sm-10">
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="8" v-model="reviewContents"></textarea>
                    </div>
                </div>

                <div class="form-group row">
                <label for="text" class="col-sm-2 col-form-label">첨부파일</label>
                <input type="file" class="form-control-file col" id="exampleFormControlFile1">
                </div>

                <div class="row ">
                    <button type="button" class="btn btn col-sm-1 ml-auto" id="btnmodi" v-on:click="moveOrderList">목록으로</button>
                    <button type="button" class="btn btn col-sm-1 " id="btnwrite" v-on:click="ReviewInsert">등록하기</button>
                </div>
            </form> 
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            productPk: 0,
            reviewTitle: "",
            reviewContents: "",
            reviewScore: 0,
            createId: "",
            createdDate: "작성자",
        };
    },
    methods: {
        ReviewInsert() {
            let obj = this;
            obj.$axios.post('http://localhost:9000/reviewWrite', {
                productPk: this.productPk,
                reviewTitle: this.reviewTitle,
                reviewContents: this.reviewContents,
                reviewScore: this.reviewScore,
                createdDate: this.createdDate,
                createId: this.createId,
            })
            .then(function() {
                console.log("비동기 통신 성공");
                obj.$router.push({name:'Mypage'});
                
            })
            .catch(function(err) {
                console.log("비동기 통신 실패");
                console.log(err);
            })
        },
        moveOrderList (customerPk) {
            this.$router.push({
                name: "Mypage",
                query: { customerPk: customerPk },
            });
        },

    },
    mounted() { 
        this.productPk = this.$route.query.productPk;
    },
}
</script>

<style scoped>
#btnmodi {
    margin-right: 20px;
}
</style>