// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1beta1/target.proto

package com.google.cloud.scheduler.v1beta1;

public final class TargetProto {
  private TargetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_HttpTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_HttpTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_HttpTarget_HeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_HttpTarget_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_HeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_AppEngineRouting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_AppEngineRouting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_OAuthToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_OAuthToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_scheduler_v1beta1_OidcToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1beta1_OidcToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/scheduler/v1beta1/target." +
      "proto\022\036google.cloud.scheduler.v1beta1\032\031g" +
      "oogle/api/resource.proto\"\376\002\n\nHttpTarget\022" +
      "\013\n\003uri\030\001 \001(\t\022?\n\013http_method\030\002 \001(\0162*.goog" +
      "le.cloud.scheduler.v1beta1.HttpMethod\022H\n" +
      "\007headers\030\003 \003(\01327.google.cloud.scheduler." +
      "v1beta1.HttpTarget.HeadersEntry\022\014\n\004body\030" +
      "\004 \001(\014\022A\n\013oauth_token\030\005 \001(\0132*.google.clou" +
      "d.scheduler.v1beta1.OAuthTokenH\000\022?\n\noidc" +
      "_token\030\006 \001(\0132).google.cloud.scheduler.v1" +
      "beta1.OidcTokenH\000\032.\n\014HeadersEntry\022\013\n\003key" +
      "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\026\n\024authorizati" +
      "on_header\"\313\002\n\023AppEngineHttpTarget\022?\n\013htt" +
      "p_method\030\001 \001(\0162*.google.cloud.scheduler." +
      "v1beta1.HttpMethod\022L\n\022app_engine_routing" +
      "\030\002 \001(\01320.google.cloud.scheduler.v1beta1." +
      "AppEngineRouting\022\024\n\014relative_uri\030\003 \001(\t\022Q" +
      "\n\007headers\030\004 \003(\0132@.google.cloud.scheduler" +
      ".v1beta1.AppEngineHttpTarget.HeadersEntr" +
      "y\022\014\n\004body\030\005 \001(\014\032.\n\014HeadersEntry\022\013\n\003key\030\001" +
      " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\327\001\n\014PubsubTarget" +
      "\0224\n\ntopic_name\030\001 \001(\tB \372A\035\n\033pubsub.google" +
      "apis.com/Topic\022\014\n\004data\030\003 \001(\014\022P\n\nattribut" +
      "es\030\004 \003(\0132<.google.cloud.scheduler.v1beta" +
      "1.PubsubTarget.AttributesEntry\0321\n\017Attrib" +
      "utesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"T\n\020AppEngineRouting\022\017\n\007service\030\001 \001(\t\022\017" +
      "\n\007version\030\002 \001(\t\022\020\n\010instance\030\003 \001(\t\022\014\n\004hos" +
      "t\030\004 \001(\t\":\n\nOAuthToken\022\035\n\025service_account" +
      "_email\030\001 \001(\t\022\r\n\005scope\030\002 \001(\t\"<\n\tOidcToken" +
      "\022\035\n\025service_account_email\030\001 \001(\t\022\020\n\010audie" +
      "nce\030\002 \001(\t*s\n\nHttpMethod\022\033\n\027HTTP_METHOD_U" +
      "NSPECIFIED\020\000\022\010\n\004POST\020\001\022\007\n\003GET\020\002\022\010\n\004HEAD\020" +
      "\003\022\007\n\003PUT\020\004\022\n\n\006DELETE\020\005\022\t\n\005PATCH\020\006\022\013\n\007OPT" +
      "IONS\020\007B\270\001\n\"com.google.cloud.scheduler.v1" +
      "beta1B\013TargetProtoP\001Z@cloud.google.com/g" +
      "o/scheduler/apiv1beta1/schedulerpb;sched" +
      "ulerpb\352A@\n\033pubsub.googleapis.com/Topic\022!" +
      "projects/{project}/topics/{topic}b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_scheduler_v1beta1_HttpTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_scheduler_v1beta1_HttpTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_HttpTarget_descriptor,
        new java.lang.String[] { "Uri", "HttpMethod", "Headers", "Body", "OauthToken", "OidcToken", "AuthorizationHeader", });
    internal_static_google_cloud_scheduler_v1beta1_HttpTarget_HeadersEntry_descriptor =
      internal_static_google_cloud_scheduler_v1beta1_HttpTarget_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_scheduler_v1beta1_HttpTarget_HeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_HttpTarget_HeadersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_descriptor,
        new java.lang.String[] { "HttpMethod", "AppEngineRouting", "RelativeUri", "Headers", "Body", });
    internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_HeadersEntry_descriptor =
      internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_HeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_AppEngineHttpTarget_HeadersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_descriptor,
        new java.lang.String[] { "TopicName", "Data", "Attributes", });
    internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_AttributesEntry_descriptor =
      internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_PubsubTarget_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_scheduler_v1beta1_AppEngineRouting_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_scheduler_v1beta1_AppEngineRouting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_AppEngineRouting_descriptor,
        new java.lang.String[] { "Service", "Version", "Instance", "Host", });
    internal_static_google_cloud_scheduler_v1beta1_OAuthToken_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_scheduler_v1beta1_OAuthToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_OAuthToken_descriptor,
        new java.lang.String[] { "ServiceAccountEmail", "Scope", });
    internal_static_google_cloud_scheduler_v1beta1_OidcToken_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_scheduler_v1beta1_OidcToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_scheduler_v1beta1_OidcToken_descriptor,
        new java.lang.String[] { "ServiceAccountEmail", "Audience", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
