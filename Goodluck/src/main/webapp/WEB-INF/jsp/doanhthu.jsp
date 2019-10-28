<%-- 
    Document   : newDuAn
    Created on : Oct 22, 2019, 7:20:09 PM
    Author     : LENOVO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  

<jsp:include page="include/header.jsp"/>

<jsp:include page="include/main-left-top.jsp"/>



<section>

    <table class="table table-hover table-doanhthu">
        <thead>
            <tr>
                <th>Năm</th>

                <th colspan="3">Loại doanh thu</th>

                <th>Doanh thu (triệu)</th>                   
            </tr>
        </thead>
        <c:forEach var="chitietduan" items="${duan.listChiTietDuAn}">
            <tbody>
                <tr>
                    <td rowspan="5">
                        ${chitietduan.nam}
                    </td>
                    <td rowspan="3">
                        Phòng
                    </td>
                    <td>Số phòng</td>
                    <td> ${chitietduan.doanhThu.soLieuDoanhThu.soLuongPhong}</td>

                    <td rowspan="3">
                        <fmt:formatNumber type="number" maxFractionDigits="3" value=" ${chitietduan.doanhThu.doanhThuPhong}" />
                    </td>
                </tr>
                <tr>

                    <td>Giá Phòng/năm (triệu)</td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.doanhThu.soLieuDoanhThu.giaPhongBinhQuan*Math.pow(1+ chitietduan.doanhThu.soLieuDoanhThu.tocDoTangGiaTrenNam/100, chitietduan.nam-1)}" />

                    </td>
                </tr>
                <tr>
                    <td>Công suất</td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.doanhThu.soLieuDoanhThu.congSuatHoatDong}" />%
                    </td>
                </tr>
                <tr>

                    <td colspan="3">
                        Nhà Hàng
                    </td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.doanhThu.doanhThuNhaHang}" />
                    </td>
                </tr>
                <tr>

                    <td colspan="2"/>
                    <td>
                        <b>Tổng doanh thu trong năm</b>
                    </td>
                    <td>
                        <strong><fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.doanhThu.tongDoanhThu}" /></strong>
                    </td>
                </tr>

            </tbody>


        </c:forEach>


    </table>
</section>

<jsp:include page="include/footer.jsp"/>
