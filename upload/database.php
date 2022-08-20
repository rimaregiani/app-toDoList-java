<?php 
 
function dbconn() { $host = "localhost";
                    $database = "database_pengguna";
                    $user = "root";
                    $password = "";
                    $conn = mysqli_connect($host, $user, $password, $database) or die("Error " . mysqli_error($conn));
                    return $conn;
                  }
 
 
class database{

  var $host = "localhost";
  var $username = "root";
  var $password = "";
  var $database = "database_pengguna";
  var $koneksi = "";
  function __construct(){
    $this->koneksi = mysqli_connect($this->host, $this->username, $this->password,$this->database);
    if (mysqli_connect_errno()){
      echo "Koneksi database gagal : " . mysqli_connect_error();
    }
  }



  
  public function simpan($query)
  {
    // $data = mysqli_query($this->koneksi, $query);
    mysqli_query($this->koneksi, $query);
  }
  
  public function tampil_data($token)
  {
    // $data = mysqli_query($this->koneksi, $query);
    $data = mysqli_query($this->koneksi, "select * from filetask where token = '$token'");
    while($row = mysqli_fetch_array($data)){
      $hasil[] = $row;
    }
    return $hasil;
  }
  
  public function loginToken($token)
  {
	$retur = "";
    $data = mysqli_query($this->koneksi, "select token from tasklist where token = '$token'");
    while($row = mysqli_fetch_array($data)){
      $hasil[] = $row;
	  $retur = $row;
    }
    return $retur;
  }
}



 
?>