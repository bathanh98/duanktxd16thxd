<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="include/header.jsp"/>

<jsp:include page="include/main-left-top.jsp"/>

<section class="row container">
    <div class="col-md-3"></div>
     <table class="table table-bordered table-hover col-md-6">
        <thead>
            <tr>
                <th>
                    Kí hiệu
                </th>
                <th>
                    Tên
                </th>
            </tr>
        </thead>
        
        <tbody>
            <tr>
                <td>
                    NPV
                </td>
                <td>
                    Giá trị hiện tại thuần
                </td>
            </tr>
             <tr>
                <td>
                    IRR
                </td>
                <td>
                    Suất sinh lời nội bộ
                </td>
            </tr>
             <tr>
                <td>
                    PP
                </td>
                <td>
                    Thời gian hoàn vốn
                </td>
            </tr>
             <tr>
                <td>
                    BCR
                </td>
                <td>
                    Tỷ số lợi ích
                </td>
            </tr>
             <tr>
                <td>
                    CIF
                </td>
                <td>
                    Doanh thu
                </td>
            </tr>
             <tr>
                <td>
                    COF
                </td>
                <td>
                    Chi phí
                </td>
            </tr>
        </tbody>
        
     </table>
    
    <div class="col-md-3"> </div>
    
</section>

<jsp:include page="include/footer.jsp"/>