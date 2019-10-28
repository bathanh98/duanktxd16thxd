<%-- 
    Document   : main-left-top
    Created on : May 30, 2019, 12:49:09 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main class="container-fluid"  >
    <div class="main-container row">
        <div class="col-left col-sm-2 bg-light">


            <c:if test="${duan==null}">
                <dl>
                    <dt>Các dự án đã thẩm định</dt>
                </dl>
                <dd>
                    <ol class="sp-ol" style="list-style-type:disc;padding-left: 10px;">
                        <li><a href="duan?id=2">Khách sạn 1 </a></li>
                        <li><a href="duan?id=1">Khách sạn 2 </a></li>
                        <li>
                            <form id="form" action="duan" method="get">
                                <input type="number" name="id" placeholder="Nhập id dự án" onchange="document.getElementById('form').submit"/>

                            </form>
                        </li>
                    </ol>
                </dd>

                <dl>
                    <dt><a href="<%=request.getContextPath()%>/newduansobo" >Tạo mới dự án</a></dt>
                </dl>

                <dl>
                    <dt>
                        <a href="" >Chỉnh sửa dự án đã thẩm định</a>
                        <form id="form"  action="duan" method="get">
                            <input type="number" name="id" placeholder="Nhập id dự án" onchange="document.getElementById('form').submit"/>
                        </form>
                    </dt>
                </dl>
                <dl>
                    <dt><a href=""> Xóa dự án đã thẩm định</a>
                        <form id="form"  action="duan" method="get">
                            <input type="number" name="id" placeholder="Nhập id dự án" onchange="document.getElementById('form').submit"/>
                        </form></dt>
                </dl>
            </c:if>
            <c:if test="${duan!=null}">
                <dl>
                    <dt>Dự án đang thẩm định</dt>
                </dl>
                <dd>
                    <ol class="sp-ol" style="list-style-type:disc;padding-left: 10px;">
                        <li><label>Tên dự án: ${duan.tenDuAn}</label></li><li>
                            <label>ID dự án: ${duan.id}</label></li>
                        <li><label>Ngày thành lập: ${duan.ngayThanhlap}</label></li>
                        <li><label>Id vốn đâu tư: ${duan.vonDauTu.id}</label></li>
                        <li><label>Chiết khấu: ${duan.chietKhau}%</label></li>
                    </ol>
                </dd>

                <dl>
                    <dt><a href="editduan" >Chỉnh sửa dự án</a> </dt>
                </dl>
                <dl>
                    <dt><a href="">Xóa dự án</a></dt>
                </dl>


            </c:if>


        </div>
        <div class="col-main col-sm-10 container-fluid">
            <h2 class="text-center"><i>WEBSITE THẨM ĐỊNH DỰ ÁN ĐẦU TƯ</i></h2>
            <br/>
            <nav class="navbar navbar-expand-md justify-content-center" >
                <ul class="navbar-nav nav-between container">

                    <li class="nav-item ">
                        <a href="<%=request.getContextPath()%>" class="nav-link text-center btn btn-success">Trang chủ</a>
                    </li>
                    <li class="nav-item ">
                        <a href="vondautu" class="nav-link text-center btn btn-success">Vốn đầu tư</a>
                    </li>
                    <li class="nav-item ">
                        <a href="danhgiaduan" class="nav-link text-center btn btn-primary">Đánh giá dự án</a>
                    </li>
                    <li class="nav-item ">
                        <a href="npv" class="nav-link text-center btn btn-primary">Chi tiết NPV</a>
                    </li>
                    <li class="nav-item">
                        <a href="irr" class="nav-link text-center btn btn-primary">Chi tiết IRR</a>
                    </li>
                    <li class="nav-item">
                        <a href="bcr" class="nav-link text-center btn btn-primary">Chi tiết BCR</a>
                    </li>
                    <li class="nav-item">
                        <a href="pp" class="nav-link text-center btn btn-primary">Chi tiết PP</a>
                    </li>
                    <li class="nav-item">
                        <a href="doanhthu" class="nav-link text-center btn btn-primary">Doanh thu</a>
                    </li>
                    <li class="nav-item">
                        <a href="chiphi" class="nav-link text-center btn btn-primary">Chi phí</a>
                    </li>
                    <li class="nav-item">
                        <a href="thoat" class="nav-link text-center btn btn-primary">Thoát dự án</a>
                    </li>

                </ul>
            </nav>






