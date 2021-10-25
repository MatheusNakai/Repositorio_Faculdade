package controler

import model.Card
import model.Deck
import org.json.JSONObject
import org.json.JSONArray as JSONArray

class DeckController{
    val deck : Deck
    constructor(){
        val reposta = khttp.get("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
        this.deck = Deck(reposta.jsonObject["deck_id"] as String)
    }
    public fun drawCard(): Card{
        val respostaCarta = khttp.get("https://deckofcardsapi.com/api/deck/${this.deck.deckId}/draw/?deck_count=1")
        val cartas = respostaCarta.jsonObject["cards"] as JSONArray
        val primeira_carta = cartas[0] as JSONObject
        return Card(primeira_carta["suit"] as String,primeira_carta["value"] as String,primeira_carta["image"] as String)

    }
}