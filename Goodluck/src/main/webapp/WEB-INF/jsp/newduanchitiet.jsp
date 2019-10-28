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


        <mvc:form modelAttribute="duan" action="saveduan" method="post">
             <mvc:hidden path="id"/> 
            <div class="container row">
                <h2 class="text-center col-md-12">Thông tin chi tiêt dự án khách sạn</h2>


                <mvc:hidden path="id" class="form-control"/>


                <div class="form-group col-md-4">
                    <label>Tên dự án: </label>
                    <mvc:input path="tenDuAn" class="form-control" placeholder="Nhập tên dự án"/>

                </div>

                <%--    <div class="form-group col-md-4">
                        <label>Ngày thành lâp: </label>
                        <mvc:input path="ngayThanhLap" type="date"  class="form-control" placeholder="Nhập ngày thành lập"/>

                </div>
                --%>
            </div>

            <div class="container-full row">
                <div class="col-md-4">

                    <mvc:hidden  path="vonDauTu.id"/>

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
                                        <mvc:input path="vonDauTu.vonTuCo" class="form-control"  placeholder="Nhập vốn tự có" required=""/>
                                    </div>
                                </th>
                                <th>
                                    <div class="form-group">
                                        <label for="uname">Chi phí vốn tự có: </label>
                                        <mvc:input path="vonDauTu.chiPhiVonTuCo" class="form-control"  placeholder="Nhập chi phí vốn tự có" required=""/>
                                    </div>
                                </th>
                            </tr>
                            <tr>
                                <th>
                                    <div class="form-group">
                                        <label>Vốn vay: </label>
                                        <mvc:input path="vonDauTu.vonVay" class="form-control" placeholder="Nhập vốn vay" required=""/>
                                    </div>
                                </th>
                                <th>
                                    <div class="form-group">
                                        <label>Chi phí vốn vay: </label>
                                        <mvc:input path="vonDauTu.chiPhiVonVay" class="form-control" placeholder="Nhập chi phí vốn vay" required=""/>
                                    </div>
                                </th>
                            </tr>
                            <tr>
                                <th colspan="2">
                                    <div class="form-group">
                                        <label >Thời gian vay: </label>
                                        <mvc:input path="vonDauTu.thoiGianVayVon" class="form-control"  placeholder="Nhập thời gian vay"  required=""/>
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
                                <th colspan="11" class="text-center">Số liệu chi phí</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>
                                    Năm
                                </td>
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

                        <c:forEach var="chiTietDuAn" items="${duan.listChiTietDuAn}" varStatus="tagStatus">

                            <mvc:hidden path="listChiTietDuAn[${tagStatus.index}].id" value="${chiTietDuAn.id}" readonly="readonly"/> 
                            <mvc:hidden path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.id" value="${chiTietDuAn.chiPhi.soLieuChiPhi.id}"/> 
                            <mvc:hidden path="listChiTietDuAn[${tagStatus.index}].chiPhi.id" value="${chiTietDuAn.chiPhi.id}"  /> 
                            <tbody>
                                <tr>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].nam" value="${chiTietDuAn.nam}" class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.luongBQ" value="${chiTietDuAn.chiPhi.soLieuChiPhi.luongBQ}" class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.soLaoDong" value="${chiTietDuAn.chiPhi.soLieuChiPhi.soLaoDong}"  class="form-control" required=""/> 
                                    </td>
                                     <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.tangLuongHangNam" value="${chiTietDuAn.chiPhi.soLieuChiPhi.tangLuongHangNam}"  class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.baoHiem" value="${chiTietDuAn.chiPhi.soLieuChiPhi.baoHiem}"  class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.dienThoai_DienNuoc" value="${chiTietDuAn.chiPhi.soLieuChiPhi.dienThoai_DienNuoc}"  class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.quangCao_TiepThi" value="${chiTietDuAn.chiPhi.soLieuChiPhi.quangCao_TiepThi}"  class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.suaChua" value="${chiTietDuAn.chiPhi.soLieuChiPhi.suaChua}"  class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.thueDat" value="${chiTietDuAn.chiPhi.soLieuChiPhi.thueDat}"  class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.quanLy" value="${chiTietDuAn.chiPhi.soLieuChiPhi.quanLy}"  class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].chiPhi.soLieuChiPhi.chiPhiPhongNgu" value="${chiTietDuAn.chiPhi.soLieuChiPhi.chiPhiPhongNgu}"  class="form-control" required=""/> 
                                    </td>
                                </tr>

                            </tbody>
                        </c:forEach>
                    </table>



                    <table class="table table-hover table-bordered">
                        <thead>
                            <tr>
                                <th colspan="10" class="text-center">Số liệu doanh thu</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>
                                    Năm
                                </td>
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
                        <c:forEach var="chiTietDuAn" items="${duan.listChiTietDuAn}" varStatus="tagStatus">
                            
                            <mvc:hidden path="listChiTietDuAn[${tagStatus.index}].doanhThu.id" value="${chiTietDuAn.doanhThu.id}"  /> 
                            <mvc:hidden path="listChiTietDuAn[${tagStatus.index}].doanhThu.soLieuDoanhThu.id" value="${chiTietDuAn.doanhThu.soLieuDoanhThu.id}" /> 
                            <tbody>
                                <tr>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].nam" value="${chiTietDuAn.nam}" class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].doanhThu.soLieuDoanhThu.soLuongPhong"  value="${chiTietDuAn.doanhThu.soLieuDoanhThu.soLuongPhong}" class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].doanhThu.soLieuDoanhThu.giaPhongBinhQuan"  value="${chiTietDuAn.doanhThu.soLieuDoanhThu.giaPhongBinhQuan}" class="form-control" required=""/> 

                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].doanhThu.soLieuDoanhThu.tocDoTangGiaTrenNam" value="${chiTietDuAn.doanhThu.soLieuDoanhThu.tocDoTangGiaTrenNam}" class="form-control" required=""/> 
                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].doanhThu.soLieuDoanhThu.congSuatHoatDong" value="${chiTietDuAn.doanhThu.soLieuDoanhThu.congSuatHoatDong}" class="form-control" required=""/> 

                                    </td>
                                    <td>
                                        <mvc:input path="listChiTietDuAn[${tagStatus.index}].doanhThu.soLieuDoanhThu.tyLeDoanhThuNhaHangSoVoiPhong"  value="${chiTietDuAn.doanhThu.soLieuDoanhThu.tyLeDoanhThuNhaHangSoVoiPhong}" class="form-control" required=""/> 
                                    </td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>




                </div>
            </div>

            <div>
                <input type="submit" value="Submit"/>
            </div>
        </mvc:form>







<jsp:include page="include/footer.jsp"/>
