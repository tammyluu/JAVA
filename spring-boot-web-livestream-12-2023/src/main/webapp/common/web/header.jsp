<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!--header area start-->
<header class="header_area">
    <!--header top start-->
    <div class="header_top">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-4">
                    <div class="welcome_text">
                        <p>Chào mừng đến với <span>Laptrinhjavaweb</span></p>
                    </div>
                </div>
                <div class="col-lg-8">
                    <div class="top_right text-right">
                        <ul>
                            <li class="currency"><a href="#"><i class="fa fa-dollar"></i> VNĐ – Việt Nam đồng <i
                                    class="zmdi zmdi-caret-down"></i></a>
                                <ul class="dropdown_currency">
                                    <li><a href="#">US Dollar</a></li>
                                    <li><a href="#">EUR – Euro</a></li>
                                    <li><a href="#">GBP – British Pound</a></li>
                                    <li><a href="#">INR – India Rupee</a></li>
                                </ul>
                            </li>
                            <li class="language"><a href="#"><i class="zmdi zmdi-dribbble"></i> Tiếng Việt <i
                                    class="zmdi zmdi-caret-down"></i></a>
                                <ul class="dropdown_language">
                                    <li><a href="#">English</a></li>
                                    <li><a href="#">Germany</a></li>
                                </ul>
                            </li>
                            <li class="top_links"><a href="#"><i class="zmdi zmdi-account"></i>
                                <i class="zmdi zmdi-caret-down"></i></a>
                                <ul class="dropdown_links">
                                    <li><a href="/logout">Đăng xuất </a></li>
                                    <li><a href="my-account.html">Tài khoản của tôi </a></li>
                                    <li><a href="cart.html">Giỏ hàng</a></li>
                                </ul>
                            </li>

                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!--header top start-->
    <!--header center area start-->
    <div class="header_middle">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-3">
                    <div class="logo">
                        <a href="index.html"><img src="<c:url value='/template/web/assets/img/logo/logo-java-web.png'/>" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="header_middle_inner">
                        <div class="search-container">
                            <form action="#">
                                <div class="hover_category">
                                    <select class="select_option" name="select" id="categori">
                                        <option selected value="1">Tìm kiếm</option>
                                        <option value="2"> HỌC LẬP TRÌNH CƠ BẢN MIỄN PHÍ </option>
                                        <option value="3">Shop</option>
                                        <option value="4">Academy</option>
                                        <option value="5">Software</option>
                                    </select>
                                </div>
                                <div class="search_box">
                                    <input placeholder="tìm kiếm..." type="text">
                                    <button type="submit"><i class="zmdi zmdi-search"></i></button>
                                </div>
                            </form>
                        </div>
                        <div class="mini_cart_wrapper">
                            <a href="javascript:void(0)"><i class="zmdi zmdi-shopping-basket"></i> <span>2 sản phẩm - 618 VNĐ</span>
                            </a>
                            <!--mini cart-->
                            <div class="mini_cart">
                                <div class="cart_item">
                                    <div class="cart_img">
                                        <a href="#"><img src="<c:url value='/template/web/assets/img/s-product/product.jpg'/>" alt=""></a>
                                    </div>
                                    <div class="cart_info">
                                        <a href="#">Condimentum Watches</a>

                                        <span class="quantity">Qty: 1</span>
                                        <span class="price_cart">$60.00</span>

                                    </div>
                                    <div class="cart_remove">
                                        <a href="#"><i class="ion-android-close"></i></a>
                                    </div>
                                </div>
                                <div class="cart_item">
                                    <div class="cart_img">
                                        <a href="#"><img src="<c:url value='/template/web/assets/img/s-product/product2.jpg'/>" alt=""></a>
                                    </div>
                                    <div class="cart_info">
                                        <a href="#">Officiis debitis</a>
                                        <span class="quantity">Qty: 1</span>
                                        <span class="price_cart">$69.00</span>
                                    </div>
                                    <div class="cart_remove">
                                        <a href="#"><i class="ion-android-close"></i></a>
                                    </div>
                                </div>
                                <div class="mini_cart_table">
                                    <div class="cart_total">
                                        <span>Subtotal:</span>
                                        <span class="price">$138.00</span>
                                    </div>
                                </div>

                                <div class="mini_cart_footer">
                                    <div class="cart_button">
                                        <a href="cart">View cart</a>
                                        <a href="checkout">Checkout</a>
                                    </div>
                                </div>

                            </div>
                            <!--mini cart end-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--header center area end-->

    <!--header middel start-->
    <div class="header_bottom sticky-header">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-12">
                    <div class="main_menu header_position">
                        <nav>
                            <ul>

                                <li class="active"><a href="index.html"><i class="zmdi zmdi-home"></i> Học lập trình cơ bản miễn phí <i
                                        class="zmdi zmdi-caret-down"></i></a>
                                    <ul class="sub_menu">
                                        <li><a href="index.html">7 ngày học java master miễn phí (Webinar)</a></li>
                                        <li><a href="index-2.html">Lộ trình học java backend</a></li>
                                        <li><a href="index-3.html">Học java web cơ bản miễn phí</a></li>
                                        <li><a href="index-4.html">Web service trong Spring Framework</a></li>
                                        <li><a href="index-5.html">Thiết kế website trong Spring Framework</a></li>
                                        <li><a href="index-6.html">Lộ trình học java web backend</a></li>
                                        <li><a href="index-7.html">Lộ trình học spring framework</a></li>
                                    </ul>
                                </li>
                                <li class="mega_items"><a href="shop.html"><i class="zmdi zmdi-shopping-basket"></i>
                                    Shop <i class="zmdi zmdi-caret-down"></i></a>
                                    <div class="mega_menu">
                                        <ul class="mega_menu_inner">
                                            <li><a href="#">Phụ kiện điện thoại</a>
                                                <ul>
                                                    <li><a href="shop-fullwidth.html">DÙ MINI CHE ĐIỆN THOẠI GẮN XE MÁY</a></li>
                                                    <li><a href="shop-fullwidth-list.html">KẸP ĐIỆN THOẠI XE MÁY 4 CẠNH YD-380</a></li>
                                                    <li><a href="shop-right-sidebar.html">GIÁ ĐỠ ĐIỆN THOẠI KIM LOẠI A30 </a></li>
                                                </ul>
                                            </li>
                                            <li><a href="#">Phụ kiện PC-Laptop</a>
                                                <ul>
                                                    <li><a href="cart.html">LOA BLUETOOTH MICROLAB M106</a></li>
                                                    <li><a href="wishlist.html">BỘ VỆ SINH LAPTOP 4 MÓN</a></li>
                                                    <li><a href="checkout.html">BÀN PHÍM CƠ MINI JEDEL KL-103 LED</a></li>
                                                    <li><a href="my-account.html">ĐẾ NÂNG ĐỠ TẢN NHIỆT LAPTOP KIM LOẠI CÓ TÚI</a></li>
                                                </ul>
                                            </li>
                                            <li><a href="#">Áo thun lập trình</a>
                                                <ul>
                                                    <li><a href="product-details.html">Áo thun lập trình Spring boot</a></li>
                                                    <li><a href="product-sidebar.html">Áo thun lập trình Spring mvc</a></li>
                                                    <li><a href="product-grouped.html">Áo thun lập trình Jsp servlet</a></li>
                                                    <li><a href="variable-product.html">Áo thun lập trình It is not a bug, it is a feature</a></li>

                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li><a href="blog.html"><i class="zmdi zmdi-collection-music"></i> Academy <i
                                        class="zmdi zmdi-caret-down"></i></a>
                                    <ul class="sub_menu pages">
                                        <li><a href="blog-details.html">Khóa học java core</a></li>
                                        <li><a href="blog-fullwidth.html">Khóa học java web</a></li>
                                        <li><a href="blog-sidebar.html">Khóa học java hosting</a></li>
                                    </ul>
                                </li>
                                <li><a href="#"><i class="zmdi zmdi-star"></i> Software <i
                                        class="zmdi zmdi-caret-down"></i></a>
                                    <ul class="sub_menu pages">
                                        <li><a href="about.html">Java hosting (Deploy project java web lên hosting)</a></li>
                                        <li><a href="services.html">Tên miền (Việt Nam và Quốc Tế)</a></li>
                                        <li><a href="portfolio.html">Cloud VPS</a></li>
                                        <li><a href="faq.html">SSL (chứng chỉ bảo mật)</a></li>
                                        <li><a href="contact.html">Email server</a></li>
                                    </ul>
                                </li>
                                <li><a href="about.html"><i class="zmdi zmdi-comments"></i> Giới thiệu</a></li>
                                <li><a href="contact.html"><i class="zmdi zmdi-account-box-mail"></i> Liên hệ</a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--header middel end-->

</header>
<!--header area end-->