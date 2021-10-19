package co.farooq.notesapp.feature_note.domain.util

sealed class NoteOrder(var orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)


    fun copy(orderType: OrderType) = when (this) {
        is NoteOrder.Title -> NoteOrder.Title(orderType = orderType)
        is NoteOrder.Date -> NoteOrder.Date(orderType = orderType)
        is NoteOrder.Color -> NoteOrder.Color(orderType = orderType)
    }
}
