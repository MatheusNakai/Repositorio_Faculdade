package dao

interface GenericDAO {
    fun getOne(id:Int): Any;
    fun getAll():List<Any>;
    fun insertOne(objeto: Any): Unit;
    fun ()
}