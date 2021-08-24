<template>   
    <main>
        <section class="jumbotron text-center">
        <!-- 캐러셀 -->
            <div class="container">
                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <!-- 캐러셀 조정-->
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class=""></li>
                        <li data-target="#myCarousel" data-slide-to="1" class=""></li>
                        <li data-target="#myCarousel" data-slide-to="2" class="active"></li>
                    </ol>

                    <div class="carousel-inner">
                        <div class="carousel-item">
                            <img class="first-slide" src="../assets/a1.jpg" alt="First slide"  width="가로 길이" height="">
                            <div class="container">
                                <div class="carousel-caption text-left" style="color:black">
                                    <h1>캐러셀 헤드라인</h1>
                                    <p>어쩌고 저쩌고 가입하세요</p>
                                    <p><a class="btn btn-lg btn-primary" href="#" role="button">클릭해서 이동하기</a></p>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="second-slide" src="../assets/a2.jpg" alt="Second slide">
                            <div class="container">
                                <div class="carousel-caption text-right" style="color:black">
                                    <h1>두번째 헤드라인</h1>
                                    <p>쓰려면 쓰고 지우려면 지우고</p>
                                    <p><a class="btn btn-lg btn-primary" href="#" role="button">버튼으로 클릭</a></p>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item active">
                            <img class="third-slide" src="../assets/a3.jpg" alt="Third slide">
                            <div class="container">
                                <div class="carousel-caption text-right" style="color:black">
                                    <h2>검색하세요</h2>
                                    <p><a class="btn btn-lg btn-primary" href="#" role="button">추후 수정</a></p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- 캐러셀 앞뒤 클릭-->
                    <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
        <!-- 캐러셀 끝 -->
        </section>

    <div class="album py-5 bg-light">
        <div class="container">
            <h2 class="main-title py-4">이런 상품은 어떠세요?</h2>

            <!-- 포토앨범 -->
          <div class="row">
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" style="height: 225px; width: 100%; display: block;" src="https://shop.hansalim.or.kr/im/is/activeDesigner/050307006_content1.jpg" data-holder-rendered="true">
                <div class="card-body">
                  <p class="card-text">밭에서 충분히 익혀 수확한 '완숙토마토' 밭에서 충분히 익혀 수확한 '완숙토마토' 밭에서 충분히 익혀 수확한 '완숙토마토'</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" src="https://shop.hansalim.or.kr/im/is/activeDesigner/050139001_content1.jpg" data-holder-rendered="true" style="height: 225px; width: 100%; display: block;">
                <div class="card-body">
                  <p class="card-text">아삭하면서도 잎이 부드러운 유기농 '생채' 아삭하면서도 잎이 부드러운 유기농 '생채' 아삭하면서도 잎이 부드러운 유기농 '생채'</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" src="https://shop.hansalim.or.kr/im/is/activeDesigner/051106023_content1.jpg" data-holder-rendered="true" style="height: 225px; width: 100%; display: block;">
                <div class="card-body">
                  <p class="card-text">잎이 풍성하고 싱싱한 대표 쌈채소 '상추' 잎이 풍성하고 싱싱한 대표 쌈채소 '상추' 잎이 풍성하고 싱싱한 대표 쌈채소 '상추'</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" src="https://shop.hansalim.or.kr/im/is/activeDesigner/090502105_content1.jpg" data-holder-rendered="true" style="height: 225px; width: 100%; display: block;">
                <div class="card-body">
                  <p class="card-text">조선된장과 한우 육수로 맛을 낸 ‘강된장양념’ 조선된장과 한우 육수로 맛을 낸 ‘강된장양념’</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" src="https://shop.hansalim.or.kr/im/is/activeDesigner/100601012_content1.jpg" data-holder-rendered="true" style="height: 225px; width: 100%; display: block;">
                <div class="card-body">
                  <p class="card-text">바로 데워 먹는 간편한 찌개 '김치청국장찌개' 바로 데워 먹는 간편한 찌개 '김치청국장찌개' </p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" src="https://shop.hansalim.or.kr/im/is/activeDesigner/100203001_content1.jpg" data-holder-rendered="true" style="height: 225px; width: 100%; display: block;">
                <div class="card-body">
                  <p class="card-text">국산 콩을 통째로 갈아 고소하고 진한 '콩비지' 국산 콩을 통째로 갈아 고소하고 진한 '콩비지'</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" src="https://shop.hansalim.or.kr/im/is/activeDesigner/090104023_content1.jpg" data-holder-rendered="true" style="height: 225px; width: 100%; display: block;">
                <div class="card-body">
                  <p class="card-text">유기재배 브로콜리의 맛과 영양을 그대로 담은 ‘브로콜리가루’ 유기재배 브로콜리의 맛과 영양을 그대로 담은 브로콜리의 맛과 영양을 그대로 담은 ‘브로콜리가루’</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" src="https://shop.hansalim.or.kr/im/is/activeDesigner/090104022_content1.jpg" data-holder-rendered="true" style="height: 225px; width: 100%; display: block;">
                <div class="card-body">
                  <p class="card-text">국산 양배추를 동결건조해 맛과 영양을 그대로 담은 '양배추가루'  국산 양배추를 동결건조해 맛과 영양을 그대로 담은 '양배추가루'</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail" alt="Thumbnail [100%x225]" src="https://shop.hansalim.or.kr/im/is/activeDesigner/060307008_content1.jpg" data-holder-rendered="true" style="height: 225px; width: 100%; display: block;">
                <div class="card-body">
                  <p class="card-text">한우고기만을 사용해 기름기를 줄인 '한우고기육수' 한우고기만을 사용해 기름기를 줄인 '한우고기육수' 한우고기만을 사용해 기름기를 줄인 '한우고기육수'</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

        <div class="content p-0">
        </div>

    </main>
</template>

<script>
export default {
    

}
</script>

<style>
.carousel-fade .carousel-item, .carousel-item img {
   max-height: 90vh;
   min-height: 50vh;
}

</style>