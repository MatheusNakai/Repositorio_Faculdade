import controler.DeckController


fun main() {
    val deckController = DeckController()
    val card = deckController.drawCard()
    println(card)
}