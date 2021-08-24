<template>
    <div class="container mr-auto">
        <div class="jumbotron text-center">
            <h1>이용후기</h1>
        </div>
        <hr>
        <div class="container" id="reviewwri">
            <form>
                <div class="form-group row">
                    <div class="col">
                        <div class="row">
                            <label for="text" class="col-sm-4 col-form-label">상품번호</label>
                            <input type="number" class="form-control col" id="exampleInputName" aria-describedby="nameHelp" placeholder="이름을 입력하세요" >
                        </div>
                    </div>
                    <div class="col">
                        <div class="row">
                            <label for="inputStar" class="col-sm-2 col-form-label">만족도</label>
                            <select id="inputStar" class="form-control col">
                                <option selected>만족도를 선택하세요</option>
                                <option>★★★★★</option>
                                <option>★★★★☆</option>
                                <option>★★★☆☆</option>
                                <option>★★☆☆☆</option>
                                <option>★☆☆☆☆</option>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="text" class="col-sm-2 col-form-label">제목</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="제목을 입력하세요">
                    </div>
                </div>

                <div class="form-group row">
                    <label for="text" class="col-sm-2 col-form-label">내용</label>
                    <div class="col-sm-10">
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="8"></textarea>
                    </div>
                </div>

                <div class="form-group row">
                <label for="text" class="col-sm-2 col-form-label">첨부파일</label>
                <input type="file" class="form-control-file col" id="exampleFormControlFile1">
                </div>

                <div class="row ">
                    <button type="button" class="btn btn-primary col-sm-1 ml-auto" id="btnmodi">수정하기</button>
                    <button type="button" class="btn btn-warning col-sm-1 ">등록하기</button>
                </div>
            </form> 
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>
#btnmodi {
    margin-right: 20px;
}
</style>