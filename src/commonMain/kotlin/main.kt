/**
 * Never gonna give you up
 * Never gonna let you down
 * Never gonna run around and desert you
 * Never gonna make you cry
 * Never gonna say goodbye
 * Never gonna tell a lie and hurt you
 */

import com.soywiz.korau.sound.readSound
import com.soywiz.korio.file.std.resourcesVfs
import com.soywiz.korio.file.std.tempVfs
import com.soywiz.korio.util.UUID
import diglol.crypto.AesCbc

/**
 * Never gonna give you up
 * Never gonna let you down
 * Never gonna run around and desert you
 * Never gonna make you cry
 * Never gonna say goodbye
 * Never gonna tell a lie and hurt you
 */
suspend fun main() {
	val neverGonnaGiveYouUp = "5C31D3C265596F7A83DE74B9D72F484AE833763C7B8B79343DBB673059AE1860"
	val neverGonnaLetYouDown = "7CBF2BAF516967BDC12B60EF8C8887E0"

//	val rickRoll = resourcesVfs["rickroll.wav"].readSound()
//	rickRoll.playAndWait()

	AesCbc(neverGonnaGiveYouUp.hexStringToByteArray(), neverGonnaLetYouDown.hexStringToByteArray()).also {
		val neverGonnaRunAroundAndDesertYou = it.decrypt(resourcesVfs["mtBvDg4PllwjCW7s67uK8DLQ.bin"].readAll())

		val neverGonnaMakeYouCry = UUID.randomUUID()
		val neverGinnaSayGoodbye = tempVfs[neverGonnaMakeYouCry.toString()]
		neverGinnaSayGoodbye.writeBytes(neverGonnaRunAroundAndDesertYou)
		val neverGonnaTellALieAndHurtYou = neverGinnaSayGoodbye.readSound()
		neverGonnaTellALieAndHurtYou.playAndWait()
		println("You have been rick rolled.")
	}
}
