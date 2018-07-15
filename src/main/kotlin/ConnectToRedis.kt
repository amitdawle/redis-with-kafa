import com.lambdaworks.redis.*

object ConnectToRedis {

    @JvmStatic
    fun main(args: Array<String>) {
        val redisClient = RedisClient(
                RedisURI.create("redis://localhost:6379"))
        val connection = redisClient.connect()

        println("Connected to Redis")
        connection.set("foo" , "bar")
        println(connection.get("foo"))

        connection.close()
        redisClient.shutdown()
    }
}