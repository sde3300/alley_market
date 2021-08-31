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
                        <th>선택</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="item in items" v-bind:key="item.customer_pk">
                        <td>{{ item.customerPk}}</td>
                        <td>{{ item.customerName }}</td>
                        <td>{{ item.customerEmail }}</td>
                        <td>{{ item.customerPhone }}</td>
                        <td>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                                <label class="form-check-label" for="defaultCheck1"></label>
                            </div>
                        </td>
                    </tr>
                </tbody>
            </table>
            <!-- 삭제버튼 -->
            <div class="d-flex justify-content-end"> 
                <button class="btn btn-danger">삭제하기</button>
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
    mounted() {
        let obj = this;

        obj.$axios.get("http://localhost:9000/cusManage")
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
#button {
    justify-content: center;
}
</style>