// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: required_fields.proto

package resources.generated

final case class Required_v1 (
	`requiredField1`: Int = 0,
	`requiredField2`: String = ""
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[Required_v1]
	with net.sandrogrzicic.scalabuff.Parser[Required_v1] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeInt32(1, `requiredField1`)
		output.writeString(2, `requiredField2`)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeInt32Size(1, `requiredField1`)
		__size += computeStringSize(2, `requiredField2`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Required_v1 = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __requiredField1: Int = 0
		var __requiredField2: String = ""

		import scala.collection.JavaConversions.mapAsScalaMap
		val required: scala.collection.mutable.Map[String, Boolean] = new java.util.HashMap[String, Boolean]
		def __newMerged = Required_v1(
			if (required("required_field_1")) __requiredField1 else __requiredField1,
			if (required("required_field_2")) __requiredField2 else __requiredField2
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => required("required_field_1") = true; __requiredField1 = in.readInt32()
			case 18 => required("required_field_2") = true; __requiredField2 = in.readString()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: Required_v1) = {
		Required_v1(
			m.`requiredField1`,
			m.`requiredField2`
		)
	}

	def getDefaultInstanceForType = Required_v1.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = {
		val indent0 = "\n" + ("\t" * indent)
		val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
		val sb = StringBuilder.newBuilder
		sb
			.append("{")
			sb.append(indent1).append("\"requiredField1\": ").append("\"").append(`requiredField1`).append("\"").append(',')
			sb.append(indent1).append("\"requiredField2\": ").append("\"").append(`requiredField2`).append("\"").append(',')
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object Required_v1 {
	@scala.beans.BeanProperty val defaultInstance = new Required_v1()

	def parseFrom(data: Array[Byte]): Required_v1 = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): Required_v1 = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): Required_v1 = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): Required_v1 = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[Required_v1] = defaultInstance.mergeDelimitedFromStream(stream)

	val REQUIRED_FIELD_1_FIELD_NUMBER = 1
	val REQUIRED_FIELD_2_FIELD_NUMBER = 2

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: Required_v1) = defaultInstance.mergeFrom(prototype)

}
final case class Required_v2 (
	`requiredField1`: Int = 0,
	`requiredField2`: String = "",
	`requiredField3`: String = ""
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[Required_v2]
	with net.sandrogrzicic.scalabuff.Parser[Required_v2] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeInt32(1, `requiredField1`)
		output.writeString(2, `requiredField2`)
		output.writeString(3, `requiredField3`)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeInt32Size(1, `requiredField1`)
		__size += computeStringSize(2, `requiredField2`)
		__size += computeStringSize(3, `requiredField3`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Required_v2 = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __requiredField1: Int = 0
		var __requiredField2: String = ""
		var __requiredField3: String = ""

		import scala.collection.JavaConversions.mapAsScalaMap
		val required: scala.collection.mutable.Map[String, Boolean] = new java.util.HashMap[String, Boolean]
		def __newMerged = Required_v2(
			if (required("required_field_1")) __requiredField1 else __requiredField1,
			if (required("required_field_2")) __requiredField2 else __requiredField2,
			if (required("required_field_3")) __requiredField3 else __requiredField3
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => required("required_field_1") = true; __requiredField1 = in.readInt32()
			case 18 => required("required_field_2") = true; __requiredField2 = in.readString()
			case 26 => required("required_field_3") = true; __requiredField3 = in.readString()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: Required_v2) = {
		Required_v2(
			m.`requiredField1`,
			m.`requiredField2`,
			m.`requiredField3`
		)
	}

	def getDefaultInstanceForType = Required_v2.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = {
		val indent0 = "\n" + ("\t" * indent)
		val (indent1, indent2) = (indent0 + "\t", indent0 + "\t\t")
		val sb = StringBuilder.newBuilder
		sb
			.append("{")
			sb.append(indent1).append("\"requiredField1\": ").append("\"").append(`requiredField1`).append("\"").append(',')
			sb.append(indent1).append("\"requiredField2\": ").append("\"").append(`requiredField2`).append("\"").append(',')
			sb.append(indent1).append("\"requiredField3\": ").append("\"").append(`requiredField3`).append("\"").append(',')
		if (sb.last.equals(',')) sb.length -= 1
		sb.append(indent0).append("}")
		sb.toString()
	}

}

object Required_v2 {
	@scala.beans.BeanProperty val defaultInstance = new Required_v2()

	def parseFrom(data: Array[Byte]): Required_v2 = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): Required_v2 = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): Required_v2 = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): Required_v2 = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[Required_v2] = defaultInstance.mergeDelimitedFromStream(stream)

	val REQUIRED_FIELD_1_FIELD_NUMBER = 1
	val REQUIRED_FIELD_2_FIELD_NUMBER = 2
	val REQUIRED_FIELD_3_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: Required_v2) = defaultInstance.mergeFrom(prototype)

}

object RequiredFields {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "Required_v1" -> (bytes ⇒ Required_v1.parseFrom(bytes)),
		 "Required_v2" -> (bytes ⇒ Required_v2.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
