using assembly System.Windows.Forms
using namespace System.Windows.Forms
$form = [Form] @{
 Text = 'Mi formulario'
}


for($i=0;$i -lt 6;$i++){
$boton=[button] @{Text='pulsar';Location = New-Object System.Drawing.Point((70*$i),100)}
$boton.add_Click{
 Write-host ("hola guapo"+$i)
}
$form.Controls.Add($boton)
}
$boton.add_Click{
 Write-host ("hola guapo"+$i)
}
$form.ShowDialog()