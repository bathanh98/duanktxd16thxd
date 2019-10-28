<%-- 
    Document   : newDuAn
    Created on : Oct 22, 2019, 7:20:09 PM
    Author     : LENOVO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="include/header.jsp"/>

<jsp:include page="include/main-left-top.jsp"/>


<section>
    <table class="table table-bordered table-hover table-doanhthu">
        <thead>
            <tr>
                <th rowspan="2">Năm</th>

                <th colspan="9" class="text-center">Loại chi phí</th>
                <th>Chi phí trong năm</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>

                </td>
                <td>
                    ID
                </td>
                <td>
                    Lương bình quân(triệu)
                </td>
                <td>
                    Bảo hiểm(%)
                </td>
                <td>
                    Điện thoại, điện nước...(%)
                </td>
                <td>
                    Quảng cáo, tiếp thị(%)
                </td>
                <td>
                    Sữa chữa(%)
                </td>
                <td>
                    Thuê đất(triệu)
                </td>
                <td>
                    Quản lý(%)
                </td>
                <td>
                    Phòng ngủ(%)
                </td>
                <td>

                </td>
            </tr>

        </tbody>
        <c:forEach var="chitietduan" items="${duan.listChiTietDuAn}">
            <tbody>
                <tr>
                    <td>
                        ${chitietduan.nam}
                    </td>
                    <td>
                        ${chitietduan.chiPhi.id}

                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="  ${chitietduan.chiPhi.tienLuong}" />
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="  ${chitietduan.chiPhi.baoHiem}" />
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.chiPhi.dienThoai}" />
                    </td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="  ${chitietduan.chiPhi.quangCao}" />
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.chiPhi.suaChua}" />
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.chiPhi.thueDat}" />
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.chiPhi.quanLy}" />
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.chiPhi.chiPhiPhongNgu}" />
                    </td>
                    <td>
                        <strong><fmt:formatNumber type="number" maxFractionDigits="3" value="${chitietduan.chiPhi.tongChiPhi}" /></strong>
                    </td>
                </tr>

            </tbody>

        </c:forEach>


    </table>
</section>


<jsp:include page="include/footer.jsp"/>