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
                    <tr>
                        <td>1</td>
                        <td>공지사항입니다</td>
                        <td>admin</td>
                        <td>2021-08-24</td>
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

            <button type="button" class="btn btn-dark float-right my-3" v-on:click="noticeInsert">글쓰기</button>
            
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style>

</style>