<template>
    <div class="container mr-auto">
        <div class="jumbotron text-center">
            <h1>공지사항 작성</h1>
        </div>
        <hr>
        <div class="container" id="noticewri">
            <form>
                <div class="form-group row">
                    <label for="text" class="col-sm-2 col-form-label">제목</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="제목을 입력하세요" v-model="noticeTitle">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="text" class="col-sm-2 col-form-label">작성자</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control-plaintext" id="exampleFormControlInput1" readonly  placeholder="제목을 입력하세요" v-model="createId">
                    </div>
                </div>

                <div class="form-group row">
                    <label for="text" class="col-sm-2 col-form-label">내용</label>
                    <div class="col-sm-10">
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="8" v-model="noticeContents"></textarea>
                    </div>
                </div>

                <div class="form-group row">
                <label for="text" class="col-sm-2 col-form-label">첨부파일</label>
                <input type="file" class="form-control-file col" id="exampleFormControlFile1">
                </div>

                <div class="row ">
                    <button type="button" class="btn btn-primary col-sm-1 ml-auto" id="btnwrite" v-on:click = "AdminNoticeWrite">등록하기</button>
                    <button type="button" class="btn btn-warning col-sm-1 " v-on:click = "moveAdminNoticeList">목록으로</button>
                </div>
            </form> 
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            boardCategoryPk:'b1',
            noticeTitle:'',
            createId:'yoo',
            noticeContents:''

        }
    },
    methods: {
        //axios를 사용하여 서버와 통신
        AdminNoticeWrite() {
            let obj = this;
            obj.$axios.post('http://localhost:9000/noticeWrite', {
                
                noticeTitle: this.noticeTitle,
                createId: this.createId,
                noticeContents: this.noticeContents
            })
            .then(function() {
                console.log("비동기 통신 성공");
                obj.$router.push({name:'AdminNoticeList'});
                
            })
            .catch(function(err) {
                console.log("비동기 통신 실패");
                console.log(err);
            })
        },
        //리스트 화면으로 이동
        moveAdminNoticeList() {
            this.$router.push({ name: 'AdminNoticeList'});
        }
    },
    
}
</script>

<style>
#btnwrite {
    margin-right: 20px;
}
</style>