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
                    <tr v-for="item in items" v-bind:key="item.noticePk">
                        <td>{{ item.noticePk}}</td>
                        <td v-on:click="moveNoticeDetail(item.noticePk)">{{ item.noticeTitle}}</td>
                        <td>{{ item.createId}}</td>
                        <td>{{ item.createDate}}</td>
                    </tr>
                </tbody>
            </table>

            <!-- 0902 : 페이징 -->
                <nav aria-label="Page navigation example" style="">
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
            items: [],
            navigatepageNums: [],
            prePage: 0,
            nextPage: 0,
                    }
        },

    mounted() {
        let obj = this;
        this.$axios.get("http://localhost:9000/noticeList")
        .then(function(res) {
            console.log("axios로 비동기 통신 성공");
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
        methods: {
            moveNoticeDetail(noticePk) {
            // push() - <router-link> 태그와 동일한 기능을 하는 함수
            // 화면 이동 시 파라미터값을 전송하려면 params 객체를 사용하여 데이터를 전송
            this.$router.push({ 
                name: 'NoticeDetail', 
                params: { noticePk: noticePk }
                });
        },
            paging(pageNum) {
            let obj = this;
            this.$axios.get("http://localhost:9000/noticeList", {
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
table {
    text-align: center;
}
</style>