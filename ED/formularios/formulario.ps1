using assembly System.Windows.Forms
using namespace System.Windows.Forms
$form = [Form] @{
 Text = 'Mi formulario'
}
$button = [Button] @{
 Text = 'Cerrar'
 
}
$button1 = [Button] @{
 Text = 'Pulsar2'
 #Dock = 'Fill'
}
$button.Location = New-Object System.Drawing.Point (50,100)
$button1.Location = New-Object System.Drawing.Point (50,150)
$button.add_Click{
 #Write-host "hola guapo"
 $form.Close() #el .close lo q hace es cerrar el formulario si pulsas ese boton
}
$button1.add_Click{
 Write-host "hola nacho"
}
$form.Controls.Add($button)
$form.Controls.Add($button1)
# $Form.StartPosition = "CenterScreen"
$form.ShowDialog()