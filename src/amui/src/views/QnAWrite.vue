<template>
    <div class="container mr-auto">
        <div class="jumbotron text-center">
            <h1>문의답변하기</h1>
        </div>
        <hr>
        <div class="container" id="qnawri">
            <form>
                <!-- <div class="form-group row">
                    <label for="text" class="col-sm-2 col-form-label">제목</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="제목을 입력하세요">
                    </div>
                </div> -->

            <!-- <div class="form-group">
                <label for="qnaTitle">문의제목 : </label>
                <input type="text" class="form-control" id="qnaTitle" name="qnaTitle" readonly> {{ qnaTitle }}
            </div> -->

            <div class="form-group">
                <label for="qnaTitle">문의 제목 : </label>
                <textarea name="qnaTitle" id="qnaTitle" cols="30" rows="1" class="form-control" v-html="qnaTitle" readonly></textarea>
            </div>
            <div class="form-group">
                <label for="qnaContents">문의내용 : </label>
                <textarea name="qnaContents" id="qnaContents" cols="30" rows="10" class="form-control" v-html="qnaContents" readonly></textarea>
            </div>

            <hr>

            <div class="form-group">
                <textarea
                    name="answerContents"
                    id="answerContents"
                    cols="50"
                    rows="5"
                    class="form-control"
                    placeholder="문의답변을 입력하세요"
                    v-model="answerContents"
                ></textarea>
            </div>

                <div class="row">
                    <button type="button" class="btn btn-warning col-sm-1" v-on:click="answerUpdate" id="btnwrite">등록하기</button> &nbsp;&nbsp;&nbsp;
                    <button type="button" class="btn btn-primary col-sm-1" v-on:click="moveQnaList" id="btnList">목록으로</button>
                </div>
            </form> 
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            qnaPk: 0,
            qnaTitle: '', 
            qnaContents: '',
            // createId: '',
            // createDate: '',

            answerContents: '',
            answerYn:'',
        }
    },
    methods: {
        moveQnaList() {
            this.$router.push({ name: "AdminQna", });
        },
        answerUpdate() {
            let obj = this;

            obj.$axios.put('http://localhost:9000/answerUpdate', {
                qnaPk: this.qnaPk,
                answerContents: this.answerContents,
                answerYn: this.answerYn,
            })
            .then(function() {
                console.log("비동기 통신 성공");
                obj.$router.push({name:'AdminQna', query: { qnaPk: obj.qnaPk }});
                
            })
            .catch(function(err) {
                console.log("비동기 통신 실패");
                console.log(err);
            })

        },
    },
    mounted() { 
        let obj = this;
        obj.qnaPk = obj.$route.query.qnaPk;

        obj.$axios.get("http://localhost:9000/qnaDetail", {
            params: {
                qnaPk: obj.qnaPk,
            },
        })
        .then(function (res) {
            console.log("axios로 비동기 통신 성공");
            obj.qnaPk = res.data.qnaPk;
            obj.qnaTitle = res.data.qnaTitle;
            obj.qnaContents = res.data.qnaContents;
        })
        .catch(function (err) {
            console.log("axios 비동기 통신 오류");
            console.log(err);
        });
    },
}
</script>

<style scoped>
#btnmodi {
    margin-right: 20px;
}
</style>