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
                    <tr v-for="item in items" v-bind:key="item.qnaPk">
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

            <!-- 0902 : 페이징 -->
                <nav aria-label="Page navigation example">
                    <ul class="pagination" style="justify-content: center;">
                        <!-- 이전으로 --> 
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Previous" v-on:click="paging(prePage)">         
                                <span aria-hidden="true">&laquo;</span>
                                <span class="sr-only">Previous</span>
                            </a> 
                        </li>
                            <!-- 숫자 --> 
                            <li class="page-item" v-for="(item, index) in navigatepageNums" v-bind:key="item.index">
                                <a class="page-link" href="#" v-on:click="paging(navigatepageNums[index])">{{navigatepageNums[index]}}</a>
                            </li>
                        <!-- 다음으로 --> 
                        <li class="page-item" >
                            <a class="page-link" href="#" aria-label="Previous" v-on:click="paging(nextPage)">         
                                <span aria-hidden="true">&raquo;</span>
                                <span class="sr-only">Next</span>
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
            items: [],
            navigatepageNums: [],
            prePage: 0,
            nextPage: 0,
                    }
        },

    mounted() {
        let obj = this;
        this.$axios.get("http://localhost:9000/qnaList")
        .then(function(res) {
            console.log("axios로 비동기 통신 성공");
                    obj.items = res.data.list;
                    obj.navigatepageNums = res.data.navigatepageNums
                    obj.nextPage = res.data.nextPage
                    obj.pageNum = res.data.pageNum
                    obj.prePage = res.data.prePage
        })
        .catch(function(err) {
            console.log("axios 비동기 통신 오류");
            console.log(err);
        });
    },
        methods: {
            answerUpdate(qnaPk) {
            this.$router.push({ 
                name: 'QnAWrite', 
                query: { qnaPk: qnaPk 
                }});
        },
            paging(pageNum) {
            let obj = this;
            this.$axios.get("http://localhost:9000/qnaList", {
                params: {
                    pageNum: pageNum
                }
            })
            .then(function(res) {
            console.log("axios로 비동기 통신 성공");
            // obj.items = res.data;
            obj.items = res.data.list;
            obj.endRow = res.data.endRow;
            obj.hasNextPage = res.data.hasNextPage;
            obj.hasPreviousPage = res.data.hasPreviousPage
            obj.isFirstPage = res.data.isFirstPage
            obj.isLastPage = res.data.isLastPage
            obj.navigateFirstPage = res.data.navigateFirstPage
            obj.navigateLastPage = res.data.navigateLastPage
            obj.navigatePages = res.data.navigatePages
            obj.navigatepageNums = res.data.navigatepageNums
            obj.nextPage = res.data.nextPage
            obj.pageNum = res.data.pageNum
            obj.pageSize = res.data.pageSize
            obj.pages = res.data.pages
            obj.prePage = res.data.prePage
            obj.size = res.data.size
            obj.startRow = res.data.startRow
            obj.total = res.data.total
            
        })
        .catch(function(err) {
            console.log("axios 비동기 통신 오류");
            console.log(err);
        });
    },
    },
}
</script>

<style>

</style>