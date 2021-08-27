<template>
    <div class="container">
        <div class="jumbotron text-center">
            <h1>상품관리</h1>
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
                        <th>재고</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>11</td>
                        <td>농수산</td>
                        <td>사과</td>
                        <td>20</td>
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
                    <button type="button" class="btn btn-dark col-sm-1 ml-auto" id="btnmodi">상품등록</button>
            </div>
        </div>
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style>

</style>