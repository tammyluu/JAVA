<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Trang chủ</title>
</head>
<body>


<!--Offcanvas menu area start-->

<div class="off_canvars_overlay">

</div>
<div class="Offcanvas_menu">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="canvas_open">
                    <span>MENU</span>
                    <a href="javascript:void(0)"><i
                            class="ion-navicon"></i></a>
                </div>
                <div class="Offcanvas_menu_wrapper">
                    <div class="canvas_close">
                        <a href="javascript:void(0)"><i
                                class="ion-android-close"></i></a>
                    </div>
                    <div class="welcome_text">
                        <p>Welcome to <span>Electronics Store</span></p>
                    </div>

                    <div class="top_right">
                        <ul>
                            <li class="currency"><a href="#"><i
                                    class="fa fa-dollar"></i> US Dollar
                                <i class="zmdi zmdi-caret-down"></i></a>
                                <ul class="dropdown_currency">
                                    <li><a href="#">EUR – Euro</a></li>
                                    <li><a href="#">GBP – British
                                        Pound</a></li>
                                    <li><a href="#">INR – India
                                        Rupee</a></li>
                                </ul>
                            </li>
                            <li class="language"><a href="#"><i
                                    class="zmdi zmdi-dribbble"></i>
                                English1 <i
                                        class="zmdi zmdi-caret-down"></i></a>
                                <ul class="dropdown_language">
                                    <li><a href="#">English</a></li>
                                    <li><a href="#">Germany</a></li>
                                </ul>
                            </li>
                            <li class="top_links"><a href="#"><i
                                    class="zmdi zmdi-account"></i> My
                                account <i
                                        class="zmdi zmdi-caret-down"></i></a>
                                <ul class="dropdown_links">
                                    <li>
                                        <a href="checkout.html">Checkout </a>
                                    </li>
                                    <li><a href="my-account.html">My
                                        Account </a></li>
                                    <li><a href="cart.html">Shopping
                                        Cart</a></li>
                                    <li>
                                        <a href="wishlist.html">Wishlist</a>
                                    </li>
                                </ul>
                            </li>

                        </ul>
                    </div>
                    <div class="search-container">
                        <form action="#">
                            <div class="hover_category">
                                <select class="select_option"
                                        name="select" id="categori2">
                                    <option selected value="1">All
                                        Categories
                                    </option>
                                    <option value="2">Accessories
                                    </option>
                                    <option value="3">Accessories &
                                        More
                                    </option>
                                    <option value="4">Butters & Eggs
                                    </option>
                                    <option value="5">Camera & Video
                                    </option>
                                    <option value="6">Mornitors</option>
                                    <option value="7">Tablets</option>
                                    <option value="8">Laptops</option>
                                    <option value="9">Handbags</option>
                                    <option value="10">Headphone &
                                        Speaker
                                    </option>
                                    <option value="11">Herbs &
                                        botanicals
                                    </option>
                                    <option value="12">Vegetables
                                    </option>
                                    <option value="13">Shop</option>
                                    <option value="14">Laptops &
                                        Desktops
                                    </option>
                                    <option value="15">Watchs</option>
                                    <option value="16">Electronic
                                    </option>
                                </select>
                            </div>
                            <div class="search_box">
                                <input placeholder="Search product..."
                                       type="text">
                                <button type="submit"><i
                                        class="zmdi zmdi-search"></i>
                                </button>
                            </div>
                        </form>
                    </div>
                    <div class="mini_cart_wrapper">
                        <a href="javascript:void(0)"><i
                                class="zmdi zmdi-shopping-basket"></i>
                            <span>2items - $213.00</span> </a>
                        <!--mini cart-->
                        <div class="mini_cart">
                            <div class="cart_item">
                                <div class="cart_img">
                                    <a href="#"><img
                                            src="<c:url value='/template/web/assets/img/s-product/product.jpg'/>"
                                            alt=""></a>
                                </div>
                                <div class="cart_info">
                                    <a href="#">Condimentum Watches</a>

                                    <span class="quantity">Qty: 1</span>
                                    <span class="price_cart">$60.00</span>

                                </div>
                                <div class="cart_remove">
                                    <a href="#"><i
                                            class="ion-android-close"></i></a>
                                </div>
                            </div>
                            <div class="cart_item">
                                <div class="cart_img">
                                    <a href="#"><img
                                            src="<c:url value='/template/web/assets/img/s-product/product2.jpg'/>"
                                            alt=""></a>
                                </div>
                                <div class="cart_info">
                                    <a href="#">Officiis debitis</a>
                                    <span class="quantity">Qty: 1</span>
                                    <span class="price_cart">$69.00</span>
                                </div>
                                <div class="cart_remove">
                                    <a href="#"><i
                                            class="ion-android-close"></i></a>
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
                                    <a href="cart.html">View cart</a>
                                    <a href="checkout.html">Checkout</a>
                                </div>
                            </div>

                        </div>
                        <!--mini cart end-->
                    </div>
                    <div id="menu" class="text-left ">
                        <ul class="offcanvas_main_menu">
                            <li class="menu-item-has-children active">
                                <a href="#">Home</a>
                                <ul class="sub-menu">
                                    <li><a href="index.html">Home 1</a>
                                    </li>
                                    <li><a href="index-2.html">Home
                                        2</a></li>
                                    <li><a href="index-3.html">Home
                                        3</a></li>
                                    <li><a href="index-4.html">Home
                                        4</a></li>
                                    <li><a href="index-5.html">Home
                                        5</a></li>
                                    <li><a href="index-6.html">Home
                                        6</a></li>
                                    <li><a href="index-7.html">Home
                                        7</a></li>
                                    <li><a href="index-8.html">Home
                                        8</a></li>
                                </ul>
                            </li>
                            <li class="menu-item-has-children">
                                <a href="#">Shop</a>
                                <ul class="sub-menu">
                                    <li class="menu-item-has-children">
                                        <a href="#">Shop Layouts</a>
                                        <ul class="sub-menu">
                                            <li>
                                                <a href="shop-fullwidth.html">Full
                                                    Width</a></li>
                                            <li>
                                                <a href="shop-fullwidth-list.html">Full
                                                    Width list</a></li>
                                            <li>
                                                <a href="shop-right-sidebar.html">Right
                                                    Sidebar </a></li>
                                            <li>
                                                <a href="shop-right-sidebar-list.html">
                                                    Right Sidebar
                                                    list</a></li>
                                            <li>
                                                <a href="shop-list.html">List
                                                    View</a></li>
                                        </ul>
                                    </li>
                                    <li class="menu-item-has-children">
                                        <a href="#">other Pages</a>
                                        <ul class="sub-menu">
                                            <li>
                                                <a href="cart.html">cart</a>
                                            </li>
                                            <li><a href="wishlist.html">Wishlist</a>
                                            </li>
                                            <li><a href="checkout.html">Checkout</a>
                                            </li>
                                            <li>
                                                <a href="my-account.html">my
                                                    account</a></li>
                                            <li><a href="404.html">Error
                                                404</a></li>
                                        </ul>
                                    </li>
                                    <li class="menu-item-has-children">
                                        <a href="#">Product Types</a>
                                        <ul class="sub-menu">
                                            <li>
                                                <a href="product-details.html">product
                                                    details</a></li>
                                            <li>
                                                <a href="product-sidebar.html">product
                                                    sidebar</a></li>
                                            <li>
                                                <a href="product-grouped.html">product
                                                    grouped</a></li>
                                            <li>
                                                <a href="variable-product.html">product
                                                    variable</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li class="menu-item-has-children">
                                <a href="#">blog</a>
                                <ul class="sub-menu">
                                    <li><a href="blog.html">blog</a>
                                    </li>
                                    <li><a href="blog-details.html">blog
                                        details</a></li>
                                    <li><a href="blog-fullwidth.html">blog
                                        fullwidth</a></li>
                                    <li><a href="blog-sidebar.html">blog
                                        sidebar</a></li>
                                </ul>

                            </li>
                            <li class="menu-item-has-children">
                                <a href="#">pages </a>
                                <ul class="sub-menu">
                                    <li><a href="about.html">About
                                        Us</a></li>
                                    <li>
                                        <a href="services.html">services</a>
                                    </li>
                                    <li><a href="portfolio.html">portfolio</a>
                                    </li>
                                    <li><a href="faq.html">Frequently
                                        Questions</a></li>
                                    <li>
                                        <a href="contact.html">contact</a>
                                    </li>
                                    <li><a href="login.html">login</a>
                                    </li>
                                    <li>
                                        <a href="wishlist.html">Wishlist</a>
                                    </li>
                                    <li><a href="404.html">Error 404</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="menu-item-has-children">
                                <a href="my-account.html">my account</a>
                            </li>
                            <li class="menu-item-has-children">
                                <a href="about.html">about Us</a>
                            </li>
                            <li class="menu-item-has-children">
                                <a href="contact.html"> Contact Us</a>
                            </li>
                        </ul>
                    </div>

                    <div class="Offcanvas_footer">
                                <span><a href="#"><i
                                        class="fa fa-envelope-o"></i> info@yourdomain.com</a></span>
                        <ul>
                            <li class="facebook"><a href="#"><i
                                    class="fa fa-facebook"></i></a></li>
                            <li class="twitter"><a href="#"><i
                                    class="fa fa-twitter"></i></a></li>
                            <li class="pinterest"><a href="#"><i
                                    class="fa fa-pinterest-p"></i></a>
                            </li>
                            <li class="google-plus"><a href="#"><i
                                    class="fa fa-google-plus"></i></a>
                            </li>
                            <li class="linkedin"><a href="#"><i
                                    class="fa fa-linkedin"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--Offcanvas menu area end-->


<!--slider area start-->
<section class="slider_section mt-20">
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="categories_menu">
                    <div class="categories_title">
                        <h2 class="categori_toggle">Danh mục</h2>
                    </div>
                    <div class="categories_menu_toggle">
                        <ul>
                            <li class="menu_item_children categorie_list">
                                <a href="#"><span><i
                                        class="zmdi zmdi-desktop-mac"></i></span>
                                    HỌC LẬP TRÌNH CƠ BẢN <i
                                            class="fa fa-angle-right"></i></a>
                                <ul class="categories_mega_menu">
                                    <li class="menu_item_children"><a
                                            href="#">Wheel Bearings</a>
                                        <ul class="categorie_sub_menu">
                                            <li><a href="">Bower</a>
                                            </li>
                                            <li><a href="">Flipbac</a>
                                            </li>
                                            <li><a href="">Gary Fong</a>
                                            </li>
                                            <li><a href="">GigaPan</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="menu_item_children"><a
                                            href="#">Wheel Rim
                                        Screws</a>
                                        <ul class="categorie_sub_menu">
                                            <li>
                                                <a href="">Accessories</a>
                                            </li>
                                            <li><a href="">2-Stroke</a>
                                            </li>
                                            <li><a href="">Handbag</a>
                                            </li>
                                            <li><a href="">Clothing</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="menu_item_children last_child">
                                        <a href="#">Wheel Simulators</a>
                                        <ul class="categorie_sub_menu">
                                            <li><a href="">Bags &
                                                Cases</a></li>
                                            <li><a href="">Binoculars &
                                                Scopes</a></li>
                                            <li><a href="">Film
                                                Photography</a></li>
                                            <li><a href="">Lighting &
                                                Studio</a></li>
                                        </ul>
                                    </li>

                                </ul>
                            </li>
                            <li class="menu_item_children"><a
                                    href="#"><span><i
                                    class="zmdi zmdi-image"></i></span>
                                Academy <i
                                        class="fa fa-angle-right"></i></a>
                                <ul class="categories_mega_menu column_3">
                                    <li class="menu_item_children"><a
                                            href="#">Chair</a>
                                        <div class="categorie_sub_menu">
                                            <ul>
                                                <li><a href="">Dining
                                                    room</a></li>
                                                <li>
                                                    <a href="">bedroom</a>
                                                </li>
                                                <li><a href=""> Home &
                                                    Office</a></li>
                                                <li><a href="">living
                                                    room</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li class="menu_item_children"><a
                                            href="#">Lighting</a>
                                        <div class="categorie_sub_menu">
                                            <ul>
                                                <li><a href="">Ceiling
                                                    Lighting</a></li>
                                                <li><a href="">Wall
                                                    Lighting</a></li>
                                                <li><a href="">Outdoor
                                                    Lighting</a></li>
                                                <li><a href="">Smart
                                                    Lighting</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li class="menu_item_children"><a
                                            href="#">Sofa</a>
                                        <div class="categorie_sub_menu">
                                            <ul>
                                                <li><a href="">Fabric
                                                    Sofas</a></li>
                                                <li><a href="">Leather
                                                    Sofas</a></li>
                                                <li><a href="">Corner
                                                    Sofas</a></li>
                                                <li><a href="">Sofa
                                                    Beds</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                            <li class="menu_item_children"><a
                                    href="#"><span><i
                                    class="zmdi zmdi-camera"></i></span>
                                Shop <i
                                        class="fa fa-angle-right"></i></a>
                                <ul class="categories_mega_menu column_2">
                                    <li class="menu_item_children"><a
                                            href="#">Brake Tools</a>
                                        <div class="categorie_sub_menu">
                                            <ul>
                                                <li><a href="">Driveshafts</a>
                                                </li>
                                                <li>
                                                    <a href="">Spools</a>
                                                </li>
                                                <li>
                                                    <a href="">Diesel </a>
                                                </li>
                                                <li>
                                                    <a href="">Gasoline</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li class="menu_item_children"><a
                                            href="#">Emergency Brake</a>
                                        <div class="categorie_sub_menu">
                                            <ul>
                                                <li><a href="">Dolls for
                                                    Girls</a></li>
                                                <li><a href="">Girls'
                                                    Learning Toys</a>
                                                </li>
                                                <li><a href="">Arts and
                                                    Crafts for Girls</a>
                                                </li>
                                                <li><a href="">Video
                                                    Games for Girls</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </li>

                                </ul>
                            </li>
                            <li class="menu_item_children"><a
                                    href="#"><span><i
                                    class="zmdi zmdi-dribbble"></i></span>
                                Software <i
                                        class="fa fa-angle-right"></i></a>
                                <ul class="categories_mega_menu column_2">
                                    <li class="menu_item_children"><a
                                            href="#">Check Trousers</a>
                                        <div class="categorie_sub_menu">
                                            <ul>
                                                <li>
                                                    <a href="">Building</a>
                                                </li>
                                                <li><a href="">Electronics</a>
                                                </li>
                                                <li><a href="">action
                                                    figures </a></li>
                                                <li><a href="">specialty
                                                    & boutique toy</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li class="menu_item_children"><a
                                            href="#">Calculators</a>
                                        <div class="categorie_sub_menu">
                                            <ul>
                                                <li><a href="">Dolls for
                                                    Girls</a></li>
                                                <li><a href="">Girls'
                                                    Learning Toys</a>
                                                </li>
                                                <li><a href="">Arts and
                                                    Crafts for Girls</a>
                                                </li>
                                                <li><a href="">Video
                                                    Games for Girls</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </li>

                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-9">
                <!--shipping area start-->
                <div class="shipping_area">
                    <div class="single_shipping">
                        <div class="shipping_icone">
                            <i class="zmdi zmdi-local-shipping zmdi-hc-fw"></i>
                        </div>
                        <div class="shipping_content">
                            <p>Giao hàng tận nơi</p>
                        </div>
                    </div>
                    <div class="single_shipping">
                        <div class="shipping_icone">
                            <i class="zmdi zmdi-replay-5"></i>
                        </div>
                        <div class="shipping_content">
                            <p>Lộ trình cho người mới bắt đầu</p>
                        </div>
                    </div>
                    <div class="single_shipping last_child">
                        <div class="shipping_icone">
                            <i class="zmdi zmdi-phone-in-talk"></i>
                        </div>
                        <div class="shipping_content">
                            <p>Tư vấn tận tình</p>
                        </div>
                    </div>
                </div>
                <!--shipping area end-->
                <div class="slider_area owl-carousel">
                    <div class="single_slider"
                         data-bgimg="<c:url value='/template/web/assets/img/slider/hoc_spring_boot.png'/>">
                        <div class="slider_content content_position_center">
                            <h1>7 days master java</h1>
                            <h2>Làm chủ java trong 7 ngày</h2>
                            <span>JAVA</span>
                            <a href="shop.html">Xem ngay</a>
                        </div>
                    </div>
                    <div class="single_slider d-flex align-items-center"
                         data-bgimg="<c:url value='/template/web/assets/img/slider/hoc_spring_mvc.png'/>">
                        <div class="slider_content content_position_left">
                            <h1>Ebook</h1>
                            <h2>Tặng ebook miễn phí </h2>
                            <span>Ebook reward</span>
                            <a href="shop.html">Xem ngay</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</section>

<!--slider area end-->

<!--category product area start-->
<section class="category_product_area mt-30 mb-50">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="category_product_carousel category_column4 owl-carousel">
                    <div class="single_category_product">
                        <div class="category_product_thumb">
                            <a href="shop.html"><img
                                    src="<c:url value='/template/web/assets/img/category/hoc_spring_boot.png'/>"
                                    alt=""></a>
                        </div>
                        <div class="category_product_name">
                            <h2><a href="shop.html">Java backend</a></h2>
                        </div>
                    </div>
                    <div class="single_category_product">
                        <div class="category_product_thumb">
                            <a href="shop.html"><img
                                    src="<c:url value='/template/web/assets/img/category/hoc_spring_mvc.png'/>"
                                    alt=""></a>
                        </div>
                        <div class="category_product_name">
                            <h2><a href="shop.html">Phụ kiện</a></h2>
                        </div>
                    </div>
                    <div class="single_category_product">
                        <div class="category_product_thumb">
                            <a href="shop.html"><img
                                    src="<c:url value='/template/web/assets/img/category/huongdandoan_java-01.png'/>"
                                    alt=""></a>
                        </div>
                        <div class="category_product_name">
                            <h2><a href="shop.html">Spring framework</a></h2>
                        </div>
                    </div>
                    <div class="single_category_product">
                        <div class="category_product_thumb">
                            <a href="shop.html"><img
                                    src="<c:url value='/template/web/assets/img/category/khainiem_trong javaweb-01.png'/>"
                                    alt=""></a>
                        </div>
                        <div class="category_product_name">
                            <h2><a href="shop.html">Web service</a></h2>
                        </div>
                    </div>
                    <div class="single_category_product">
                        <div class="category_product_thumb">
                            <a href="shop.html"><img
                                    src="<c:url value='/template/web/assets/img/category/laptrinhjava_podcast-01.png'/>"
                                    alt=""></a>
                        </div>
                        <div class="category_product_name">
                            <h2><a href="shop.html">Áo thun lập trình</a></h2>
                        </div>
                    </div>
                    <div class="single_category_product">
                        <div class="category_product_thumb">
                            <a href="shop.html"><img
                                    src="<c:url value='/template/web/assets/img/category/lo_trinh_hoc_java_web.png'/>"
                                    alt=""></a>
                        </div>
                        <div class="category_product_name">
                            <h2><a href="shop.html">7 days master</a></h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!--category product area end-->


<!--home product area start-->
<section class="home_product_area mb-50">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="product_header">
                    <div class="section_title">
                        <h2>Laptrinhjavaweb <span>Shop</span></h2>
                    </div>
                    <div class="product_tab_button">
                        <ul class="nav" role="tablist">
                            <li>
                                <a class="active" data-bs-toggle="tab"
                                   href="#leftop1" role="tab"
                                   aria-controls="leftop1"
                                   aria-selected="true">
                                    Áo thun lập trình
                                </a>
                            </li>
                            <li>
                                <a data-bs-toggle="tab" href="#desktop1"
                                   role="tab" aria-controls="desktop1"
                                   aria-selected="false">
                                    Phụ kiện điện thoại
                                </a>
                            </li>
                            <li>
                                <a data-bs-toggle="tab" href="#Camera1"
                                   role="tab" aria-controls="Camera1"
                                   aria-selected="false">
                                    Đồ gia dụng
                                </a>
                            </li>
                            <li>
                                <a data-bs-toggle="tab" href="#Digital"
                                   role="tab" aria-controls="Digital"
                                   aria-selected="false">
                                    Phụ kiện PC-Laptop
                                </a>
                            </li>
                            <li>
                                <a data-bs-toggle="tab"
                                   href="#Speakers1" role="tab"
                                   aria-controls="Speakers1"
                                   aria-selected="false">
                                    Speakers
                                </a>
                            </li>
                            <li>
                                <a data-bs-toggle="tab" href="#monitors"
                                   role="tab" aria-controls="monitors"
                                   aria-selected="false">
                                    Software
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="tab-content">
                    <div class="tab-pane fade show active" id="leftop1"
                         role="tabpanel">
                        <div class="product_carousel product_column4 owl-carousel">
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/d97a21ca-10a8-4b09-9aba-6951d7a0cd3e.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Aliquam
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/Đế-nâng-đỡ-laptop-kim-loại-Aluminum-có-túi-1.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Condimentum
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/Đế-nâng-đỡ-laptop-kim-loại-Aluminum-có-túi-10.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Headphone
                                                ipsum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/95787229-bc04-4ee5-8cc6-8940791efd66.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Epicuri
                                                per</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/Bàn-phím-cơ-mini-Jedel-KL-103-Led-1.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Itaque
                                                earum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="tab-pane fade" id="desktop1"
                         role="tabpanel">
                        <div class="product_carousel product_column4 owl-carousel">
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/2d5699c4-b1df-4760-b144-1cc97d006493.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Aliquam
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/42e4f689-7083-4dba-9718-c5d34c5c7ef0.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Condimentum
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/1f798425-b7a2-4e5a-a057-f4a72839e86c.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Headphone
                                                ipsum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/0713a8aa-6407-4269-82e8-3fd5ac4b1995.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Epicuri
                                                per</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/4ccec19c-c7c2-4bac-b22f-248b740026f1.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Itaque
                                                earum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="Camera1"
                         role="tabpanel">
                        <div class="product_carousel product_column4 owl-carousel">
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/81f655ec-48e1-4cf8-8d3b-97f008254e2b.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Aliquam
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/40318d87-c002-40b8-a5ca-1ae607d665ff.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Condimentum
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/557f1e2d-cfb0-4da9-9bc4-3212c5d487b4.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Headphone
                                                ipsum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/5501bd0a-b1b5-4703-8daf-61312b04f7c3.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Epicuri
                                                per</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/d97a21ca-10a8-4b09-9aba-6951d7a0cd3e.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Itaque
                                                earum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="Digital"
                         role="tabpanel">
                        <div class="product_carousel product_column4 owl-carousel">
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/557f1e2d-cfb0-4da9-9bc4-3212c5d487b4.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Aliquam
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product21.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Condimentum
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product22.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Headphone
                                                ipsum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product23.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Epicuri
                                                per</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product24.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Itaque
                                                earum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="Speakers1"
                         role="tabpanel">
                        <div class="product_carousel product_column4 owl-carousel">
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product15.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Aliquam
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product16.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Condimentum
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product17.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Headphone
                                                ipsum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product18.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Epicuri
                                                per</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product19.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Itaque
                                                earum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="monitors"
                         role="tabpanel">
                        <div class="product_carousel product_column4 owl-carousel">
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product17.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Aliquam
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product18.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Condimentum
                                                Watches</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product19.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Headphone
                                                ipsum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product20.jpg'/>"
                                            alt=""></a>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Epicuri
                                                per</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="single_product">
                                <div class="product_thumb">
                                    <a href="product-details.html"><img
                                            src="<c:url value='/template/web/assets/img/product/product21.jpg'/>"
                                            alt=""></a>
                                    <div class="label_product">
                                        <span class="label_sale">sale</span>
                                    </div>
                                    <div class="quick_button">
                                        <a href="#"
                                           data-bs-toggle="modal"
                                           data-bs-target="#modal_box"
                                           title="quick view"> <i
                                                class="zmdi zmdi-eye"></i></a>
                                    </div>
                                </div>
                                <div class="product_content">
                                    <div class="product_name">
                                        <h3>
                                            <a href="product-details.html">Itaque
                                                earum</a></h3>
                                    </div>
                                    <div class="product_rating">
                                        <ul>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                            <li><a href="#"><i
                                                    class="zmdi zmdi-star-outline"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="price_box">
                                        <span class="current_price">$65.00</span>
                                        <span class="old_price">$70.00</span>
                                    </div>
                                    <div class="action_links">
                                        <ul>
                                            <li class="wishlist"><a
                                                    href="wishlist.html"
                                                    title="Add to Wishlist"><i
                                                    class="fa fa-heart-o"
                                                    aria-hidden="true"></i></a>
                                            </li>
                                            <li class="add_to_cart"><a
                                                    href="cart.html"
                                                    title="add to cart"><i
                                                    class="zmdi zmdi-shopping-cart-plus"></i>
                                                add to cart</a></li>
                                            <li class="compare"><a
                                                    href="#"
                                                    title="compare"><i
                                                    class="zmdi zmdi-swap"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</section>
<!--home product area end-->

<!--banner area start-->
<div class="banner_area mb-50">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="single_banner">
                    <div class="banner_thumb">
                        <a href="shop.html"><img
                                src="<c:url value='/template/web/assets/img/bg/tv.png'/>"
                                alt=""></a>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
<!--banner area end-->

<!--news letter popup start-->
<%--<div class="newletter-popup">
    <div id="boxes" class="newletter-container">
        <div id="dialog" class="window">
            <div class="box">

                <a href="${model.formUrl}" target="_blank">
                    <c:if test="${not empty model.image}">
                        <c:set var="imagePath" value="/repository${model.image}"/>
                        <img src="${imagePath}" id="viewImage" height="375px" width="500px">
                    </c:if>
                    <c:if test="${empty model.image}">
                        <img src="/repository/default.png" id="viewImage" height="375px" width="500px">
                    </c:if>
                </a>
            </div>
        </div>

    </div>
</div>--%>

<!--news letter popup start-->

<script>
    var theImg = document.getElementById('viewImage');
    var delay = ${model.delay};
    setTimeout(function () {
        <%--theImg.style.height = "${model.height}px";--%>
        <%--theImg.style.width = "${model.width}px";--%>
        $('.newletter-popup').bPopup();
    }, delay);
</script>

</body>
</html>
