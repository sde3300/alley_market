<template>
    <div class="container mr-auto">
        <div class="jumbotron text-center">
            <h1>공지사항</h1>
        </div>

        <div class="container">
            <h5>제목입니다</h5>
            
            <hr>

            <p class="contents">내용입니다</p>

            <hr>

            <div class="row ">
                    <button type="button" class="btn btn-dark col-sm-2 ml-auto" id="btnmodi">목록으로</button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style>
    #btnmodi {
    margin-right: 20px;
}

.contents{
    padding: 200px 100px;
    box-sizing: border-box;
    text-align: left;
}

</style>