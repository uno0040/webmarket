<html>
<body>
<style>
.grid-container {
  display: grid;
  grid-template-columns: auto auto auto;
  background-color: #2196F3;
  padding: 10px;
}
.grid-item {
  background-color: rgba(255, 255, 255, 0.8);
  border: 1px solid rgba(0, 0, 0, 0.8);
  padding: 20px;
  font-size: 30px;
  text-align: center;
}
.myButton {
	box-shadow:inset 0px 0px 15px 3px #23395e;
	background:linear-gradient(to bottom, #2e466e 5%, #415989 100%);
	background-color:#2e466e;
	border-radius:17px;
	border:1px solid #1f2f47;
	display:inline-block;
	cursor:pointer;
	color:#ffffff;
	font-family:Arial;
	font-size:15px;
	padding:6px 13px;
	text-decoration:none;
	text-shadow:0px 1px 0px #263666;
}
.myButton:hover {
	background:linear-gradient(to bottom, #415989 5%, #2e466e 100%);
	background-color:#415989;
}
.myButton:active {
	position:relative;
	top:1px;
}
.topcorner{
   position:absolute;
   top:10;
   right:10;
  }
.topcorner1{
     position:absolute;
     top:10;
     right:85;
  }
</style>
<div class="topcorner">
<a href="#" class="myButton">Entrar</a>
</div>
<div class="topcorner1">
<a href="#" class="myButton">Criar conta</a>
</div>
<center>
<h2>Mercado Novo</h2>
</center>
<hr size="1" width="95%" color="black">
<div class="grid-container">
  <div class="grid-item">anuncio 1</div>
  <div class="grid-item">anuncio 2</div>
  <div class="grid-item">anuncio 3</div>
  <div class="grid-item">anuncio 4</div>
  <div class="grid-item">anuncio 5</div>
  <div class="grid-item">anuncio 6</div>
  <div class="grid-item">anuncio 7</div>
  <div class="grid-item">anuncio 8</div>
  <div class="grid-item">anuncio 9</div>
</div>
</body>
</html>
