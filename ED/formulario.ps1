using assembly System.Windows.Forms
using namespace System.Windows.Forms
$Form = New-Object System.Windows.Forms.Form
$Label = New-Object System.Windows.Forms.Label
$Label.Text = "Este es el formulario de subastas de objetos antiguos y modernos"
$Label.AutoSize = $True
$Form.MinimizeBox =$false
$Form.MaximizeBox =$true
$boton = [Button] @{
 Text = 'Pulsar'
}
$boton1 = [Button] @{
 Text = 'Pulsar1'
}
$boton2 = [Button] @{
 Text = 'Pulsar2'
}
$boton3 = [Button] @{
 Text = 'Mejor pag web'
}
$boton.Location = New-Object System.Drawing.Point (20,100)
$boton1.Location = New-Object System.Drawing.Point (90,100)
$boton2.Location = New-Object System.Drawing.Point (160,100)
$boton3.Location = New-Object System.Drawing.Point (100,100)

$boton.add_Click{

$Form = New-Object System.Windows.Forms.Form
$Label = New-Object System.Windows.Forms.Label
$Label.Text = "Subastas generales"
$Label.AutoSize = $True
$Form.Controls.Add($Label)
$Form.ShowDialog()
}
$boton1.add_Click{

$Form = New-Object System.Windows.Forms.Form
$Label = New-Object System.Windows.Forms.Label
$Label.Text = "Subastas de antiguedades"
$Label.AutoSize = $True
$Form.Controls.Add($Label)
$Form.ShowDialog($form.Controls.Add($boton3))

$form.Controls.Add($boton3)
$form.Controls.Add($boton4)
}
$boton2.add_Click{

$Form = New-Object System.Windows.Forms.Form
$Label = New-Object System.Windows.Forms.Label
$Label.Text = "Subasta moderna"
$Label.AutoSize = $True
$Form.Controls.Add($Label)
$Form.ShowDialog()
}
$boton3.add_Click{

$Form = New-Object System.Windows.Forms.Form
$Label = New-Object System.Windows.Forms.Label
$Label.Text = Start-Process "https://www.jesusninoc.com/"
$boton3.Size = New-Object System.Drawing.Size(75,23)
$Form.Controls.Add($Label)
$Form.ShowDialog()
}

$form.Controls.Add($boton)
$form.Controls.Add($boton1)
$form.Controls.Add($boton2)
$Form.Controls.Add($Label)
$Form.ShowDialog()