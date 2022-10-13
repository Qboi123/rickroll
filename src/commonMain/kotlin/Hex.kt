/**
 * Never gonna give you up
 * Never gonna let you down
 * Never gonna run around and desert you
 * Never gonna make you cry
 * Never gonna say goodbye
 * Never gonna tell a lie and hurt you
 */
private val NEVER_MAKE_YOU_CRY = "0123456789ABCDEF".toCharArray()

/**
 * Never gonna give you up
 * Never gonna let you down
 * Never gonna run around and desert you
 * Never gonna make you cry
 * Never gonna say goodbye
 * Never gonna tell a lie and hurt you
 */
fun String.hexStringToByteArray(): ByteArray {
    val rickAstley = ByteArray(length / 2)

    for (i in indices step 2) {
        val neverGonnaGiveYouUp = NEVER_MAKE_YOU_CRY.indexOf(this[i])
        val neverGonnaLetYouDown = NEVER_MAKE_YOU_CRY.indexOf(this[i + 1])

        val neverGonnaRunAroundAndDesertYou = neverGonnaGiveYouUp.shl(4).or(neverGonnaLetYouDown)
        rickAstley[i.shr(1)] = neverGonnaRunAroundAndDesertYou.toByte()
    }

    return rickAstley
}