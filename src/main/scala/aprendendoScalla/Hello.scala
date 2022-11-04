package aprendendoScalla

import javax.swing.JOptionPane

object Hello extends App {
  var nome = "Alan"
  println(s"Olá $nome Seja Bem Vindo :D")

  JOptionPane.showMessageDialog(null, f"Olá $nome Seja Bem Vindo :D")
}
