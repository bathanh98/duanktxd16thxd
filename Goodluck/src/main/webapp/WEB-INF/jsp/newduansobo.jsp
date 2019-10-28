<%-- 
    Document   : newDuAn
    Created on : Oct 22, 2019, 7:20:09 PM
    Author     : LENOVO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="include/header.jsp"/>

<jsp:include page="include/main-left-top.jsp"/>
<section>

        <mvc:form modelAttribute="soboduan" action="soboduan" method="post">
            <div class="container row">
                <h2 class="text-center col-md-12">Thông tin sơ bộ dự án khách sạn</h2>

                <div class="form-group col-md-4">
                    <label>Tên dự án: </label>
                    <mvc:input path="tenDuAn" class="form-control" placeholder="Nhập tên dự án" value="Anphabet" required=""/>
                </div>
                <div class="form-group col-md-4">
                    <label >Thời gian thẩm định: </label>
                    <mvc:input path="soNamThamDinh" class="form-control" value="8" placeholder="Nhập thời gian thẩm định" required=""/>
                </div>

            </div>

            <div class="container-full row">
                <div class="col-md-4">
                    <table class="table table-hover table-bordered">
                        <thead>
                            <tr>
                                <th colspan="2">Vốn đầu tư</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th>
                                    <div class="form-group">
                                        <label>Vốn tự có: </label>
                                        <mvc:input path="vonDauTu.vonTuCo" class="form-control" value="35000" placeholder="Nhập vốn tự có" required=""/>
                                    </div>
                                </th>
                                <th>
                                    <div class="form-group">
                                        <label for="uname">Chi phí vốn tự có: </label>
                                        <mvc:input path="vonDauTu.chiPhiVonTuCo" class="form-control" value="9.0" placeholder="Nhập chi phí vốn tự có" required=""/>
                                    </div>
                                </th>
                            </tr>
                            <tr>
                                <th>
                                    <div class="form-group">
                                        <label>Vốn vay: </label>
                                        <mvc:input path="vonDauTu.vonVay" class="form-control" value="15000" placeholder="Nhập vốn vay" required=""/>
                                    </div>
                                </th>
                                <th>
                                    <div class="form-group">
                                        <label>Chi phí vốn vay: </label>
                                        <mvc:input path="vonDauTu.chiPhiVonVay" class="form-control" value="10.1" placeholder="Nhập chi phí vốn vay" required=""/>
                                    </div>
                                </th>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <div class="form-group">
                                        <label >Thời gian vay: </label>
                                        <mvc:input path="vonDauTu.thoiGianVayVon" class="form-control"  value="8" placeholder="Nhập thời gian vay"  required=""/>
                                    </div>
                                </th>
                            </tr>
                        </tbody>
                    </table>
                </div>

                <div class="col-md-8 row">
                    <table class="table table-hover table-bordered">
                        <thead>
                            <tr>
                                <th colspan="10" class="text-center">Số liệu chi phí</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>
                                    Lương bình quân
                                </td>
                                <td>
                                    Số lao động
                                </td>
                                <td>
                                    Tăng lương hàng năm
                                </td>
                                <td>
                                    Bảo hiểm
                                </td>
                                <td>
                                    Điện thoại, điện nước...
                                </td>
                                <td>
                                    Quảng cáo, tiếp thị
                                </td>
                                <td>
                                    Sữa chữa
                                </td>
                                <td>
                                    Thuê đất
                                </td>
                                <td>
                                    Quản lý
                                </td>
                                <td>
                                    Phòng ngủ
                                </td>
                            </tr>

                        </tbody>
                        <tbody>
                            <tr>
                                <td>
                                    <mvc:input path="soLieuChiPhi.luongBQ" value="7" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuChiPhi.soLaoDong" value="30" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuChiPhi.tangLuongHangNam" value="3" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuChiPhi.baoHiem" value="24" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuChiPhi.dienThoai_DienNuoc" value="8" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuChiPhi.quangCao_TiepThi" value="10" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuChiPhi.suaChua" value="8" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuChiPhi.thueDat" value="20" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuChiPhi.quanLy" value="18" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuChiPhi.chiPhiPhongNgu" value="8" class="form-control" required=""/> 
                                </td>
                            </tr>

                        </tbody>
                    </table>
                    <table class="table table-hover table-bordered">
                        <thead>
                            <tr>
                                <th colspan="9" class="text-center">Số liệu doanh thu</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>
                                    Số lượng phòng
                                </td>
                                <td>
                                    Giá phòng bình quân
                                </td>
                                <td>
                                    Tốc độ tăng giá
                                </td>
                                <td>
                                    Công suất hoạt động
                                </td>
                                <td>
                                    Doanh thu nhà hàng
                                </td>
                            </tr>

                        </tbody>
                        <tbody>
                            <tr>
                                <td>
                                    <mvc:input path="soLieuDoanhThu.soLuongPhong"  value="55" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuDoanhThu.giaPhongBinhQuan"  value="1000" class="form-control" required=""/> 

                                </td>
                                <td>
                                    <mvc:input path="soLieuDoanhThu.tocDoTangGiaTrenNam" value="1" class="form-control" required=""/> 
                                </td>
                                <td>
                                    <mvc:input path="soLieuDoanhThu.congSuatHoatDong" value="30" class="form-control" required=""/> 

                                </td>
                                <td>
                                    <mvc:input path="soLieuDoanhThu.tyLeDoanhThuNhaHangSoVoiPhong"  value="7" class="form-control" required=""/> 
                                </td>


                            </tr>

                        </tbody>
                    </table>
                </div>
            </div>

            <div>
                <input type="submit" value="Submit"/>
            </div>
        </mvc:form>
</section>






<jsp:include page="include/footer.jsp"/>
