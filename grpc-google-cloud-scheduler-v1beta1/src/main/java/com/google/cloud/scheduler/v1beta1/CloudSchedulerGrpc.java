/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.scheduler.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/scheduler/v1beta1/cloudscheduler.proto")
public final class CloudSchedulerGrpc {

  private CloudSchedulerGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.scheduler.v1beta1.CloudScheduler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.ListJobsRequest,
          com.google.cloud.scheduler.v1beta1.ListJobsResponse>
      getListJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListJobs",
      requestType = com.google.cloud.scheduler.v1beta1.ListJobsRequest.class,
      responseType = com.google.cloud.scheduler.v1beta1.ListJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.ListJobsRequest,
          com.google.cloud.scheduler.v1beta1.ListJobsResponse>
      getListJobsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.scheduler.v1beta1.ListJobsRequest,
            com.google.cloud.scheduler.v1beta1.ListJobsResponse>
        getListJobsMethod;
    if ((getListJobsMethod = CloudSchedulerGrpc.getListJobsMethod) == null) {
      synchronized (CloudSchedulerGrpc.class) {
        if ((getListJobsMethod = CloudSchedulerGrpc.getListJobsMethod) == null) {
          CloudSchedulerGrpc.getListJobsMethod =
              getListJobsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.scheduler.v1beta1.ListJobsRequest,
                          com.google.cloud.scheduler.v1beta1.ListJobsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListJobs"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.ListJobsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.ListJobsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new CloudSchedulerMethodDescriptorSupplier("ListJobs"))
                      .build();
        }
      }
    }
    return getListJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.GetJobRequest, com.google.cloud.scheduler.v1beta1.Job>
      getGetJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJob",
      requestType = com.google.cloud.scheduler.v1beta1.GetJobRequest.class,
      responseType = com.google.cloud.scheduler.v1beta1.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.GetJobRequest, com.google.cloud.scheduler.v1beta1.Job>
      getGetJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.scheduler.v1beta1.GetJobRequest,
            com.google.cloud.scheduler.v1beta1.Job>
        getGetJobMethod;
    if ((getGetJobMethod = CloudSchedulerGrpc.getGetJobMethod) == null) {
      synchronized (CloudSchedulerGrpc.class) {
        if ((getGetJobMethod = CloudSchedulerGrpc.getGetJobMethod) == null) {
          CloudSchedulerGrpc.getGetJobMethod =
              getGetJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.scheduler.v1beta1.GetJobRequest,
                          com.google.cloud.scheduler.v1beta1.Job>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.GetJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudSchedulerMethodDescriptorSupplier("GetJob"))
                      .build();
        }
      }
    }
    return getGetJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.CreateJobRequest,
          com.google.cloud.scheduler.v1beta1.Job>
      getCreateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateJob",
      requestType = com.google.cloud.scheduler.v1beta1.CreateJobRequest.class,
      responseType = com.google.cloud.scheduler.v1beta1.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.CreateJobRequest,
          com.google.cloud.scheduler.v1beta1.Job>
      getCreateJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.scheduler.v1beta1.CreateJobRequest,
            com.google.cloud.scheduler.v1beta1.Job>
        getCreateJobMethod;
    if ((getCreateJobMethod = CloudSchedulerGrpc.getCreateJobMethod) == null) {
      synchronized (CloudSchedulerGrpc.class) {
        if ((getCreateJobMethod = CloudSchedulerGrpc.getCreateJobMethod) == null) {
          CloudSchedulerGrpc.getCreateJobMethod =
              getCreateJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.scheduler.v1beta1.CreateJobRequest,
                          com.google.cloud.scheduler.v1beta1.Job>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.CreateJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudSchedulerMethodDescriptorSupplier("CreateJob"))
                      .build();
        }
      }
    }
    return getCreateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.UpdateJobRequest,
          com.google.cloud.scheduler.v1beta1.Job>
      getUpdateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateJob",
      requestType = com.google.cloud.scheduler.v1beta1.UpdateJobRequest.class,
      responseType = com.google.cloud.scheduler.v1beta1.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.UpdateJobRequest,
          com.google.cloud.scheduler.v1beta1.Job>
      getUpdateJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.scheduler.v1beta1.UpdateJobRequest,
            com.google.cloud.scheduler.v1beta1.Job>
        getUpdateJobMethod;
    if ((getUpdateJobMethod = CloudSchedulerGrpc.getUpdateJobMethod) == null) {
      synchronized (CloudSchedulerGrpc.class) {
        if ((getUpdateJobMethod = CloudSchedulerGrpc.getUpdateJobMethod) == null) {
          CloudSchedulerGrpc.getUpdateJobMethod =
              getUpdateJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.scheduler.v1beta1.UpdateJobRequest,
                          com.google.cloud.scheduler.v1beta1.Job>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.UpdateJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudSchedulerMethodDescriptorSupplier("UpdateJob"))
                      .build();
        }
      }
    }
    return getUpdateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.DeleteJobRequest, com.google.protobuf.Empty>
      getDeleteJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteJob",
      requestType = com.google.cloud.scheduler.v1beta1.DeleteJobRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.DeleteJobRequest, com.google.protobuf.Empty>
      getDeleteJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.scheduler.v1beta1.DeleteJobRequest, com.google.protobuf.Empty>
        getDeleteJobMethod;
    if ((getDeleteJobMethod = CloudSchedulerGrpc.getDeleteJobMethod) == null) {
      synchronized (CloudSchedulerGrpc.class) {
        if ((getDeleteJobMethod = CloudSchedulerGrpc.getDeleteJobMethod) == null) {
          CloudSchedulerGrpc.getDeleteJobMethod =
              getDeleteJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.scheduler.v1beta1.DeleteJobRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.DeleteJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudSchedulerMethodDescriptorSupplier("DeleteJob"))
                      .build();
        }
      }
    }
    return getDeleteJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.PauseJobRequest,
          com.google.cloud.scheduler.v1beta1.Job>
      getPauseJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseJob",
      requestType = com.google.cloud.scheduler.v1beta1.PauseJobRequest.class,
      responseType = com.google.cloud.scheduler.v1beta1.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.PauseJobRequest,
          com.google.cloud.scheduler.v1beta1.Job>
      getPauseJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.scheduler.v1beta1.PauseJobRequest,
            com.google.cloud.scheduler.v1beta1.Job>
        getPauseJobMethod;
    if ((getPauseJobMethod = CloudSchedulerGrpc.getPauseJobMethod) == null) {
      synchronized (CloudSchedulerGrpc.class) {
        if ((getPauseJobMethod = CloudSchedulerGrpc.getPauseJobMethod) == null) {
          CloudSchedulerGrpc.getPauseJobMethod =
              getPauseJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.scheduler.v1beta1.PauseJobRequest,
                          com.google.cloud.scheduler.v1beta1.Job>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.PauseJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudSchedulerMethodDescriptorSupplier("PauseJob"))
                      .build();
        }
      }
    }
    return getPauseJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.ResumeJobRequest,
          com.google.cloud.scheduler.v1beta1.Job>
      getResumeJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeJob",
      requestType = com.google.cloud.scheduler.v1beta1.ResumeJobRequest.class,
      responseType = com.google.cloud.scheduler.v1beta1.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.ResumeJobRequest,
          com.google.cloud.scheduler.v1beta1.Job>
      getResumeJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.scheduler.v1beta1.ResumeJobRequest,
            com.google.cloud.scheduler.v1beta1.Job>
        getResumeJobMethod;
    if ((getResumeJobMethod = CloudSchedulerGrpc.getResumeJobMethod) == null) {
      synchronized (CloudSchedulerGrpc.class) {
        if ((getResumeJobMethod = CloudSchedulerGrpc.getResumeJobMethod) == null) {
          CloudSchedulerGrpc.getResumeJobMethod =
              getResumeJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.scheduler.v1beta1.ResumeJobRequest,
                          com.google.cloud.scheduler.v1beta1.Job>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumeJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.ResumeJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudSchedulerMethodDescriptorSupplier("ResumeJob"))
                      .build();
        }
      }
    }
    return getResumeJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.RunJobRequest, com.google.cloud.scheduler.v1beta1.Job>
      getRunJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunJob",
      requestType = com.google.cloud.scheduler.v1beta1.RunJobRequest.class,
      responseType = com.google.cloud.scheduler.v1beta1.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.scheduler.v1beta1.RunJobRequest, com.google.cloud.scheduler.v1beta1.Job>
      getRunJobMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.scheduler.v1beta1.RunJobRequest,
            com.google.cloud.scheduler.v1beta1.Job>
        getRunJobMethod;
    if ((getRunJobMethod = CloudSchedulerGrpc.getRunJobMethod) == null) {
      synchronized (CloudSchedulerGrpc.class) {
        if ((getRunJobMethod = CloudSchedulerGrpc.getRunJobMethod) == null) {
          CloudSchedulerGrpc.getRunJobMethod =
              getRunJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.scheduler.v1beta1.RunJobRequest,
                          com.google.cloud.scheduler.v1beta1.Job>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.RunJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.scheduler.v1beta1.Job.getDefaultInstance()))
                      .setSchemaDescriptor(new CloudSchedulerMethodDescriptorSupplier("RunJob"))
                      .build();
        }
      }
    }
    return getRunJobMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static CloudSchedulerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudSchedulerStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudSchedulerStub>() {
          @java.lang.Override
          public CloudSchedulerStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudSchedulerStub(channel, callOptions);
          }
        };
    return CloudSchedulerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudSchedulerBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudSchedulerBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudSchedulerBlockingStub>() {
          @java.lang.Override
          public CloudSchedulerBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudSchedulerBlockingStub(channel, callOptions);
          }
        };
    return CloudSchedulerBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static CloudSchedulerFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudSchedulerFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<CloudSchedulerFutureStub>() {
          @java.lang.Override
          public CloudSchedulerFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new CloudSchedulerFutureStub(channel, callOptions);
          }
        };
    return CloudSchedulerFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class CloudSchedulerImplBase implements io.grpc.BindableService {

    /** */
    public void listJobs(
        com.google.cloud.scheduler.v1beta1.ListJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.ListJobsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListJobsMethod(), responseObserver);
    }

    /** */
    public void getJob(
        com.google.cloud.scheduler.v1beta1.GetJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobMethod(), responseObserver);
    }

    /** */
    public void createJob(
        com.google.cloud.scheduler.v1beta1.CreateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateJobMethod(), responseObserver);
    }

    /** */
    public void updateJob(
        com.google.cloud.scheduler.v1beta1.UpdateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateJobMethod(), responseObserver);
    }

    /** */
    public void deleteJob(
        com.google.cloud.scheduler.v1beta1.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteJobMethod(), responseObserver);
    }

    /** */
    public void pauseJob(
        com.google.cloud.scheduler.v1beta1.PauseJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseJobMethod(), responseObserver);
    }

    /** */
    public void resumeJob(
        com.google.cloud.scheduler.v1beta1.ResumeJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(getResumeJobMethod(), responseObserver);
    }

    /** */
    public void runJob(
        com.google.cloud.scheduler.v1beta1.RunJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(getRunJobMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListJobsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.scheduler.v1beta1.ListJobsRequest,
                      com.google.cloud.scheduler.v1beta1.ListJobsResponse>(
                      this, METHODID_LIST_JOBS)))
          .addMethod(
              getGetJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.scheduler.v1beta1.GetJobRequest,
                      com.google.cloud.scheduler.v1beta1.Job>(this, METHODID_GET_JOB)))
          .addMethod(
              getCreateJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.scheduler.v1beta1.CreateJobRequest,
                      com.google.cloud.scheduler.v1beta1.Job>(this, METHODID_CREATE_JOB)))
          .addMethod(
              getUpdateJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.scheduler.v1beta1.UpdateJobRequest,
                      com.google.cloud.scheduler.v1beta1.Job>(this, METHODID_UPDATE_JOB)))
          .addMethod(
              getDeleteJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.scheduler.v1beta1.DeleteJobRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_JOB)))
          .addMethod(
              getPauseJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.scheduler.v1beta1.PauseJobRequest,
                      com.google.cloud.scheduler.v1beta1.Job>(this, METHODID_PAUSE_JOB)))
          .addMethod(
              getResumeJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.scheduler.v1beta1.ResumeJobRequest,
                      com.google.cloud.scheduler.v1beta1.Job>(this, METHODID_RESUME_JOB)))
          .addMethod(
              getRunJobMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.scheduler.v1beta1.RunJobRequest,
                      com.google.cloud.scheduler.v1beta1.Job>(this, METHODID_RUN_JOB)))
          .build();
    }
  }

  /** */
  public static final class CloudSchedulerStub
      extends io.grpc.stub.AbstractAsyncStub<CloudSchedulerStub> {
    private CloudSchedulerStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudSchedulerStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudSchedulerStub(channel, callOptions);
    }

    /** */
    public void listJobs(
        com.google.cloud.scheduler.v1beta1.ListJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.ListJobsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void getJob(
        com.google.cloud.scheduler.v1beta1.GetJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void createJob(
        com.google.cloud.scheduler.v1beta1.CreateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void updateJob(
        com.google.cloud.scheduler.v1beta1.UpdateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void deleteJob(
        com.google.cloud.scheduler.v1beta1.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteJobMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void pauseJob(
        com.google.cloud.scheduler.v1beta1.PauseJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseJobMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void resumeJob(
        com.google.cloud.scheduler.v1beta1.ResumeJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResumeJobMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void runJob(
        com.google.cloud.scheduler.v1beta1.RunJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /** */
  public static final class CloudSchedulerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CloudSchedulerBlockingStub> {
    private CloudSchedulerBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudSchedulerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudSchedulerBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.scheduler.v1beta1.ListJobsResponse listJobs(
        com.google.cloud.scheduler.v1beta1.ListJobsRequest request) {
      return blockingUnaryCall(getChannel(), getListJobsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.scheduler.v1beta1.Job getJob(
        com.google.cloud.scheduler.v1beta1.GetJobRequest request) {
      return blockingUnaryCall(getChannel(), getGetJobMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.scheduler.v1beta1.Job createJob(
        com.google.cloud.scheduler.v1beta1.CreateJobRequest request) {
      return blockingUnaryCall(getChannel(), getCreateJobMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.scheduler.v1beta1.Job updateJob(
        com.google.cloud.scheduler.v1beta1.UpdateJobRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateJobMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteJob(
        com.google.cloud.scheduler.v1beta1.DeleteJobRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteJobMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.scheduler.v1beta1.Job pauseJob(
        com.google.cloud.scheduler.v1beta1.PauseJobRequest request) {
      return blockingUnaryCall(getChannel(), getPauseJobMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.scheduler.v1beta1.Job resumeJob(
        com.google.cloud.scheduler.v1beta1.ResumeJobRequest request) {
      return blockingUnaryCall(getChannel(), getResumeJobMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.scheduler.v1beta1.Job runJob(
        com.google.cloud.scheduler.v1beta1.RunJobRequest request) {
      return blockingUnaryCall(getChannel(), getRunJobMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class CloudSchedulerFutureStub
      extends io.grpc.stub.AbstractFutureStub<CloudSchedulerFutureStub> {
    private CloudSchedulerFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudSchedulerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudSchedulerFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.scheduler.v1beta1.ListJobsResponse>
        listJobs(com.google.cloud.scheduler.v1beta1.ListJobsRequest request) {
      return futureUnaryCall(getChannel().newCall(getListJobsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.scheduler.v1beta1.Job>
        getJob(com.google.cloud.scheduler.v1beta1.GetJobRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetJobMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.scheduler.v1beta1.Job>
        createJob(com.google.cloud.scheduler.v1beta1.CreateJobRequest request) {
      return futureUnaryCall(getChannel().newCall(getCreateJobMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.scheduler.v1beta1.Job>
        updateJob(com.google.cloud.scheduler.v1beta1.UpdateJobRequest request) {
      return futureUnaryCall(getChannel().newCall(getUpdateJobMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteJob(
        com.google.cloud.scheduler.v1beta1.DeleteJobRequest request) {
      return futureUnaryCall(getChannel().newCall(getDeleteJobMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.scheduler.v1beta1.Job>
        pauseJob(com.google.cloud.scheduler.v1beta1.PauseJobRequest request) {
      return futureUnaryCall(getChannel().newCall(getPauseJobMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.scheduler.v1beta1.Job>
        resumeJob(com.google.cloud.scheduler.v1beta1.ResumeJobRequest request) {
      return futureUnaryCall(getChannel().newCall(getResumeJobMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.scheduler.v1beta1.Job>
        runJob(com.google.cloud.scheduler.v1beta1.RunJobRequest request) {
      return futureUnaryCall(getChannel().newCall(getRunJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_JOBS = 0;
  private static final int METHODID_GET_JOB = 1;
  private static final int METHODID_CREATE_JOB = 2;
  private static final int METHODID_UPDATE_JOB = 3;
  private static final int METHODID_DELETE_JOB = 4;
  private static final int METHODID_PAUSE_JOB = 5;
  private static final int METHODID_RESUME_JOB = 6;
  private static final int METHODID_RUN_JOB = 7;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudSchedulerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CloudSchedulerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_JOBS:
          serviceImpl.listJobs(
              (com.google.cloud.scheduler.v1beta1.ListJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.ListJobsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_JOB:
          serviceImpl.getJob(
              (com.google.cloud.scheduler.v1beta1.GetJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job>)
                  responseObserver);
          break;
        case METHODID_CREATE_JOB:
          serviceImpl.createJob(
              (com.google.cloud.scheduler.v1beta1.CreateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job>)
                  responseObserver);
          break;
        case METHODID_UPDATE_JOB:
          serviceImpl.updateJob(
              (com.google.cloud.scheduler.v1beta1.UpdateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job>)
                  responseObserver);
          break;
        case METHODID_DELETE_JOB:
          serviceImpl.deleteJob(
              (com.google.cloud.scheduler.v1beta1.DeleteJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PAUSE_JOB:
          serviceImpl.pauseJob(
              (com.google.cloud.scheduler.v1beta1.PauseJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job>)
                  responseObserver);
          break;
        case METHODID_RESUME_JOB:
          serviceImpl.resumeJob(
              (com.google.cloud.scheduler.v1beta1.ResumeJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job>)
                  responseObserver);
          break;
        case METHODID_RUN_JOB:
          serviceImpl.runJob(
              (com.google.cloud.scheduler.v1beta1.RunJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.scheduler.v1beta1.Job>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class CloudSchedulerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CloudSchedulerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.scheduler.v1beta1.SchedulerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CloudScheduler");
    }
  }

  private static final class CloudSchedulerFileDescriptorSupplier
      extends CloudSchedulerBaseDescriptorSupplier {
    CloudSchedulerFileDescriptorSupplier() {}
  }

  private static final class CloudSchedulerMethodDescriptorSupplier
      extends CloudSchedulerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CloudSchedulerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CloudSchedulerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new CloudSchedulerFileDescriptorSupplier())
                      .addMethod(getListJobsMethod())
                      .addMethod(getGetJobMethod())
                      .addMethod(getCreateJobMethod())
                      .addMethod(getUpdateJobMethod())
                      .addMethod(getDeleteJobMethod())
                      .addMethod(getPauseJobMethod())
                      .addMethod(getResumeJobMethod())
                      .addMethod(getRunJobMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
