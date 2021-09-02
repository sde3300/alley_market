<template>
    <div class="container">

        <div class="jumbotron text-center">
            <h1>문의관리</h1>
        </div>
        <hr>

        <div class="col-md-12">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>문의번호</th>
                        <th>상품이름</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>작성날짜</th>
                        <th>답변여부</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="item in qnas" v-bind:key="item.qnaPk">
                        <td>{{ item.qnaPk}}</td>
                        <td>{{ item.productName }}</td>
                        <td>
                            <div data-toggle="collapse" v-bind:data-target="'#qna' + item.qnaPk" aria-expanded="false" v-bind:aria-controls="'qna' + item.qnaPk"> {{ item.qnaTitle }} </div>
                                <br>
                            <div class="collapse" v-bind:id="'qna' + item.qnaPk">
                            <div class="card card-body"> {{ item.qnaContents }} </div>
                                <div>
                                    <div class="card card-body">
                                        {{ item.answerContents }}
                                    </div>
                                </div>
                            </div>
                            </td>
                        <td>{{ item.createId}}</td>
                        <td>{{ item.createDate}}</td>
                        <td>{{ item.answerYn}}</td>
                        <td><button type="button" class="btn btn-dark" v-on:click="answerUpdate(item.qnaPk)">답변하기</button></td>
                    </tr>
                </tbody>
            </table>

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
            productName: "",
            qnas: []
        }
    },
    methods: {
        answerUpdate(qnaPk) {
            this.$router.push({ name: 'QnAWrite', query: { qnaPk: qnaPk }});
        },
    },
    mounted() {
        let obj = this;

        obj.$axios.get("http://localhost:9000/qnaList")
        .then(function(res) {
            console.log("axios로 비동기 통신 성공");
            obj.qnas = res.data;
        })
        .catch(function(err) {
            console.log("axios 비동기 통신 오류");
            console.log(err);
        });
    },
    
}
</script>

<style>

</style>