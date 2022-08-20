<?php

if(isset($_POST['B1']))
{
  // $akses = $db->tampil_data("select token from tasklist where token = '$_POST[TToken]'");
  // if (@$akses[0] == "")
  // {
    // echo "<script>alert('Login gagal !, Token tidak ditemukan');document.location.href='?menu=token';</script>"; 
  // }
  // else if(@$akses[0] == "MNG")
  // {
    // @$data = $db->tampil_data("select role from user where username='$_POST[TUserName]' and password='$_POST[TPassword]'");
    // @$_SESSION['orang'] = $data[0];
	// if($_SESSION['orang'] == "")
    // { 
	  // echo "<script>alert('Login gagal !, UserName atau Password salah');document.location.href='?menu=token';</script>";
    // }
	// else
	// {
	  // echo "<script>document.location.href='?menu=karyawan'</script>"; 
    // }   
  // }
  // else if(@$akses[0] == "ADM")
  // { 
    // @$data = $db->tampil_data("select role from user where username='$_POST[TUserName]' and password='$_POST[TPassword]'");
    // @$_SESSION['orang'] = $data[0];
	// if($_SESSION['orang'] == "")
    // { 
	  // echo "<script>alert('Login gagal !, UserName atau Password salah');document.location.href='?menu=token';</script>";
    // }
	// else
	// {
	  // echo "<script>document.location.href='?menu=Upload'</script>"; 
    // }
  // }
  // unset($_SESSION["orang"]);
  $akses = $db->tampil_data($_POST['TToken']);
  
  @$masuk = "";
  foreach($db->tampil_data(@$_GET['token']) as $x)
  {
	  @$masuk = $x['token'];
  }
  
  // @$_SESSION['orang'] = $akses[0];
   if (@$akses == "")
   {
     echo "<script>alert('Login gagal !, Token tidak ditemukan');document.location.href='?menu=token';</script>"; 
   }
   else
   {
	 echo "<script>document.location.href='?menu=upload&token=AQLNWDMCLT'</script>";
   }
   
}
   



 
   
?>

<form method = "post" enctype="multipart/form-data">
        <section class="page-section clearfix">
            <div class="container">
                <div class="intro">
                    <img class="intro-img img-fluid mb-3 mb-lg-0 rounded" src="assets/img/list.png" alt="..." />
                    <div class="intro-text left-0 text-center bg-faded p-5 rounded">
                        <h2 class="section-heading mb-4">
                            <span class="section-heading-upper">Input Token</span>
                            <span class="section-heading-lower">HERE</span>
                        </h2>
						
						<div class="form-group">
                                               <label></label>
											   <input type="text" class="form-control" name="TToken" id="fileToUpload" placeholder="Token">
                                           </div>
						
                        <p class="mb-3">
						
						</p>
                        <div class="intro-button mx-auto"><button name="B1" class="btn btn-primary"><i class="glyphicon glyphicon-camera"></i> Input </button></div>
                    </div>
                </div>
            </div>
        </section>
		</form>