<template>
    <div class="container">
        <div class="jumbotron text-center">
            <h1>상품재고관리</h1>
        </div>
        <hr>

        <div class="container">
        <div class="col-md-12">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>NO.</th>
                        <th>상품번호</th>
                        <th>카테고리</th>
                        <th>상품이름</th>
                        <th>가게이름</th>
                        <th>재고</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="item in items" v-bind:key="item.boardIdx">
                        <td>{{ item.boardIdx}}</td>
                        <td>{{ item.productPk}}</td>
                        <td>{{ item.productCategoryPk}}</td>
                        <td>{{ item.productName}}</td>
                        <td>{{ item.productStore}}</td>
                        <td>{{ item.productStockCnt}}</td>
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

            <!-- 버튼 -->
            <div class="row">
                    <button type="button" class="btn btn col-sm-2 ml-auto" id="btnmodi" v-on:click="moveProductInsert">상품등록</button>
            </div>
        </div>
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
        // this.$axios.get("http://localhost:9000/stockList")
        this.$axios.get("/stockList")
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
        moveProductInsert() {
            this.$router.push({name: 'AdminProductInsert'});
        },
            paging(pageNum) {
            let obj = this;
            // this.$axios.get("http://localhost:9000/stockList", {
            this.$axios.get("/stockList", {
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