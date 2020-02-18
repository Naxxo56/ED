using assembly System.Windows.Forms
using namespace System.Windows.Forms
$Form = New-Object System.Windows.Forms.Form
$Form.Text = "Formulario ED"
$button = [Button] @{
 Text = 'Abrir otro formulario'
 Dock = 'Fill'
}
$button.add_Click{
 $button1 = [Button] @{
 Text = 'Abrir formulario'

}
}
$button1.add_Click{
 $button2 = [Button] @{
 Text = 'Abrir formulario'

}
}
$button2.add_Click{
Write-host "cucu"
}
$form.Controls.Add($button)
$form.Controls.Add($button1)
$form.Controls.Add($button2)
$Form.ShowDialog()