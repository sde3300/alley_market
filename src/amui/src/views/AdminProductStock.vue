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

            <!-- 버튼 -->
            <div class="row">
                    <button type="button" class="btn btn-dark col-sm-2 ml-auto" id="btnmodi" v-on:click="moveProductInsert">상품등록</button>
            </div>
        </div>
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
        moveProductInsert() {
            this.$router.push({name: 'AdminProductInsert'});
        }
    },
    mounted() {
        let obj = this;

        obj.$axios.get("http://localhost:9000/stockList", {
            params: {
                boardIdx: 1
            }
        })
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

</style>