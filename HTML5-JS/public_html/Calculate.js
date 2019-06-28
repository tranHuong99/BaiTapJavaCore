//Có 4 nhóm
//Nhóm 1: số (bao gồm cả dấu .)
//Nhóm 2: phép tính
//Nhóm 3: xóa
//Nhóm 4: =

//object kết quả
var ketqua = document.getElementById("rs");
//vừa bấm phép tính?
var doi_phep_tinh = false;
//số phép tính ưu tiên tìm thấy
var uu_tien = 0;

//mảng ghi nhớ các số hạng
var mang_so_index = 0;
var mang_so = new Array();
//mảng ghi nhớ phép tính
var mang_pt_index = 0;
var mang_pt = new Array();
//nội dung đang có
var str_ketqua = '';
//phím mới
var phim_moi = '';
//cài đặt sự kiện
function clickBtn(obj){
    //chuỗi hiện tại của kết quả
    if(str_ketqua=='' && phim_moi==''){
        str_ketqua = ketqua.value;
    }
    if(str_ketqua=='0'){
        str_ketqua = '';
    }
    //HTML của phím bấm
    var type = obj.innerHTML;
    //nhóm số
    if(type=='0' || type=='1' || type=='2' || type=='3' || type=='4' || type=='5' || type=='6' || type=='7' || type=='8' || type=='9' || type=='.')
    {
        doi_phep_tinh = false;
        phim_moi += type;
        //thay đổi kết quả hiển thị
        ketqua.value = str_ketqua + phim_moi;
    }
    //nhóm phép tính
    else if(type=='+' || type=='-' || type=='*' ||type=='/'){
        //trước đó có bấm 1 phép tính
        if(doi_phep_tinh){
            mang_pt[mang_pt_index-1] = type;
            //xử lý hiển thị
            ketqua.value = ketqua.value.substring(ketqua.value.length)+type;
        }
        //chưa bấm phép tính
        else{
            mang_so[mang_so_index] = parseFloat(phim_moi);
            mang_so_index++;
            mang_pt[mang_pt_index] = type;
            mang_pt_index++;
            //xử lý hiển thị
            ketqua.value = ketqua.value+type;
        }
        //ghi nhớ đã bấm phím phép tính
        doi_phep_tinh = true;
        //đổi giá trị 2 chuỗi cơ bản về rỗng
        str_ketqua = '';
        phim_moi = '';
    }
    console.log(mang_so);
    console.log(mang_pt);
}


