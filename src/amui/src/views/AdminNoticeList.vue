<template>
    <div class="container">

        <div class="jumbotron text-center">
            <h1>공지사항</h1>
        </div>
        <hr>

        <div class="col-md-12">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>NO.</th>
                        <th>SUBJECT</th>
                        <th>Name</th>
                        <th>작성일</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="item in items" v-bind:key="item.notice_pk">
                        <td>{{ item.noticePk}}</td>
                        <td v-on:click="moveNoticeDetail(item.notice_pk)">{{ item.noticeTitle}}</td>
                        <td>{{ item.createId}}</td>
                        <td>{{ item.createDate}}</td>
                    </tr>
                </tbody>
            </table>

            <!-- 글쓰기 버튼  -->
            <div class="row">
                <button type="button" class="btn btn-dark col-sm-1 ml-auto" id="btnmodi">글쓰기</button>
            </div>

            <!-- 페이징 -->
            <nav aria-label="Page navigation example">
                <ul class="pagination" style="justify-content: center;">
                    <li class="page-item">
                    <a class="page-link" href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item">
                    <a class="page-link" href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                    </li>
                </ul>
            </nav>

        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            items: []
        }
    },
    methods: {
        moveNoticeDetail(noticePk) {
            // push() - <router-link> 태그와 동일한 기능을 하는 함수
            // 화면 이동 시 파라미터값을 전송하려면 params 객체를 사용하여 데이터를 전송
            this.$router.push({ name: 'NoticeDetail', params: { noticePk: noticePk }});
        },
    
        moveNoticeWrite() {
            this.$router.push({name: 'Insert'});
        }
    },
    mounted() {
        let obj = this;

        obj.$axios.get("http://localhost:9000/noticeList")
        .then(function(res) {
            console.log("axios로 비동기 통신 성공");
            obj.items = res.data;
        })
        .catch(function(err) {
            console.log("axios 비동기 통신 오류");
            console.log(err);
        });
    }
    
}
</script>

<style>
table {
    text-align: center;
}
</style>