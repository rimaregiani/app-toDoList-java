<?php
if (isset($_POST['B1']))
   { 
			//$check = getimagesize($_FILES["T1"]["tmp_name"]);
     //if ($check !== false)
        //{ 


		    $filename = $_FILES['fileToUpload']['name'];
		    $destination = 'file/' . $filename;
		    $extension = pathinfo($filename, PATHINFO_EXTENSION);
		    // $url = 'http://localhost/'.$filename
		   
		    $file = $_FILES['fileToUpload']['tmp_name'];
		    $size = $_FILES['fileToUpload']['size'];

		    if (!in_array($extension, ['zip', 'pdf', 'docx'])) {
        		echo "You file extension must be .zip, .pdf or .docx";
		    } elseif ($_FILES['fileToUpload']['size'] > 1000000) { 
		        echo "File too large!";
		    } else {
		        if (move_uploaded_file($file, $destination)) {
		            $kon->query("insert into filetask(token, nama_file, note, create_date) values('$_GET[token]', '$filename', '$_POST[T2]', NOW())");
		            if (mysqli_query($conn, $sql)) {
		                echo "File uploaded successfully";
		            }
		        } else {
		            echo "Failed to upload file.";
		        }
		    }

      //       $temp = explode(".", $_FILES["fileToUpload"]["name"]);
			
		    // error_reporting(0);
      //       $folder = "file/";
      //       $upload_image = $_FILES['fileToUpload']['name']; 
          
      //       $destination = 'file/' . $upload_image;
      //       move_uploaded_file($_FILES['T1']['name'], $destination);
 
          
            // $nama_baru = "resize_" . uniqid(rand()) . "." .end($temp);
            // $nama_baru = $_FILES['fileToUpload']['name'];		    
		  
            // $kon->query("insert into filetask(token, nama_file, note, create_date) values('$_GET[token]', '$nama_baru', '$_POST[T2]', NOW())");
			// $db->simpan("insert into filetask(token, nama_file, note, create_date) values('$_GET[token]', '$nama_baru', '$_POST[T2]', now)");
			
			
        //}
     //else { echo "<script>alert('format file harus gambar !');document.location.href='?menu=gallery hotel'</script>";}
   }
?>

<form method = "post" enctype="multipart/form-data">
        <section class="page-section clearfix">
            <div class="container">
                <div class="intro">
                    <img class="intro-img img-fluid mb-3 mb-lg-0 rounded" src="assets/img/list.png" alt="..." />
                    <div class="intro-text left-0 text-center bg-faded p-5 rounded">
                        <h2 class="section-heading mb-4">
                            <span class="section-heading-upper">Upload File</span>
                            <span class="section-heading-lower">HERE</span>
                        </h2>
						
						<div class="form-group">
                                               <label></label>
											   <input type="text" class="form-control" name="T2" id="fileToUpload" placeholder = "note">
											   <br>
											   <input type="file" class="form-control" name="fileToUpload" id="fileToUpload">
                                           </div>
						
                        <p class="mb-3">
						
						</p>
                        <div class="intro-button mx-auto"><button name="B1" class="btn btn-primary"><i class="glyphicon glyphicon-camera"></i> Upload </button></div>
                    </div>
                </div>
            </div>
        </section>
		</form>
        <section class="page-section cta">
            <div class="container">
                <div class="row">
                    <div class="col-xl-9 mx-auto">
                        <div class="cta-inner bg-faded text-center rounded">
                            <h2 class="section-heading mb-4">
                                <span class="section-heading-upper">File yang sudah di Upload</span>
                                <span class="section-heading-lower"></span>
                            </h2>
                            <p class="mb-0">
<table border="1">
	<tr>
		<th>No</th>
		<th>Token</th>
		<th>File Name</th>
		<th>Note</th>
		<th>Download</th>
	</tr>
	<?php
	$no = 1;
	// foreach($db->tampil_data("select * from filetask where token = '@$_SESSION['orang']'") as $x){
	foreach($db->tampil_data(@$_GET['token']) as $x){
	?>
	<tr>
		<td><?php echo $no++; ?></td>
		<td><?php echo $x['token']; ?></td>
		<td><?php echo $x['nama_file']; ?></td>
		<td><?php echo $x['note']; ?></td>
		<td>
		<a href="/upload/file/<?php echo $x['nama_file']; ?>" target="_blank">download here
</a>
		
		</td>
		
	</tr>
	<?php 
	}
	?>
</table>
							</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>