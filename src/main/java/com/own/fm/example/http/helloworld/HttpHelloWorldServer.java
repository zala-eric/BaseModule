package com.own.fm.example.http.helloworld;

import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

public class HttpHelloWorldServer {
	private EventLoopGroup bossGroup;
	private EventLoopGroup workerGroup;
	
	//监听端口
	private int port;
	
	private ChannelHandler channelHandler;
	
	private HttpHelloWorldServer(){
		
	}
	
	public HttpHelloWorldServer(int bossThreads,
			int workerThreads, int port, ChannelHandler channelHandler) {
		super();
		/* 
	     * NioEventLoopGroup实际上就是个线程池, 
	     * NioEventLoopGroup在后台启动了n个NioEventLoop来处理Channel事件, 
	     * 每一个NioEventLoop负责处理m个Channel, 
	     * NioEventLoopGroup从NioEventLoop数组里挨个取出NioEventLoop来处理Channel 
	     */
		this.bossGroup = new NioEventLoopGroup(bossThreads);
		this.workerGroup = new NioEventLoopGroup(workerThreads);
		this.port = port;
		this.channelHandler = channelHandler;
	}
	
	
	/**
	 * 服务启动入口
	 */
	public void start(){
		
	}
	
	/**
	 * 关闭服务入口
	 */
	public void stop(){
		
	}
	
}
