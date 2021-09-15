<template>
    <div class="container">

        <div class="jumbotron text-center">
            <h1>회원관리</h1>
        </div>
        <hr>

        <div class="col-md-12">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>회원번호</th>
                        <th>이름</th>
                        <th>이메일</th>
                        <th>전화번호</th>
                        <th>관리자여부</th>
                        <th>회원삭제</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="item in items" v-bind:key="item.customer_pk">
                        <td>{{ item.customerPk}}</td>
                        <td>{{ item.customerName }}</td>
                        <td>{{ item.customerEmail }}</td>
                        <td>{{ item.customerPhone }}</td>
                        <td>{{ item.adminYn }}</td>

                        <td id="deletecus" class="d-flex justify-content-center">
                            <button type="button" class="close" aria-label="Close" v-on:click="customerDelete(item.customerPk)" id="deletecustomer">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </td>
                    </tr>
                </tbody>
            </table>
            <!-- 삭제버튼 -->
            <!-- <div class="d-flex justify-content-end"> 
                <button class="btn btn-danger">삭제하기</button>
            </div> -->
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
                items: [],
                navigatepageNums: [],
                prePage: 0,
                nextPage: 0,
                // customerPk:0
                    }
                },
        mounted() {
            let obj = this;
            // this.$axios.get("http://localhost:9000/cusManage")
            this.$axios.get("http://3.142.47.127:9000/cusManage")
            .then(function(res) {
                console.log("axios로 비동기 통신 성공");
                // this.items = res.data;
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
            paging(pageNum) {
                let obj = this;
                // this.$axios.get("http://localhost:9000/cusManage", {
                this.$axios.get("http://18.222.233.235:9000/cusManage", {
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
            customerDelete(customerPk) {
                let obj = this;
                // obj.orderDetailPk = obj.$route.query.orderDetailPk;

                // this.$axios.delete('http://localhost:9000/customersDelete', {
                this.$axios.delete('http://18.222.233.235:9000/customersDelete', {
                    params: {
                        customerPk: customerPk
                    }
                })
                .then(function() {
                    console.log("비동기 통신 성공");
                    obj.$router.go(obj.$router.currentRouter);
                })
                .catch(function(err) {
                    console.log("비동기 통신 실패");
                    console.log(err);
                });
            }
        },
    }
</script>

<style>
#deletecustomer {
    color: rgb(243, 87, 87);
}
#deletecus {
    text-align: center;
}

</style>